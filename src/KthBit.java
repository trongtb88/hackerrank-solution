public class KthBit {
    static boolean isKthBitSet(int n,
                               int k)
    {
        if ((n & (1 << (k - 1))) != 0)
            return true;
        return false;
    }

    /* Returns the answer for
    each query with range L
    to R querying for the number
    of elements with the Kth bit
    set in the range */
    static int answerQuery(int L, int R,
                           int K, int arr[])
    {
        // counter stores the number
        // of element in the range
        // with the kth bit set
        int counter = 0;
        for (int i = L; i <= R; i++)
        {
            if (isKthBitSet(arr[i], K))
            {
                counter++;
            }
        }
        return counter;
    }

    // Print the answer
// for all queries
    static void answerQueries(int queries[][], int Q,
                              int arr[], int N)
    {
        int query_L, query_R, query_K;

        for (int i = 0; i < Q; i++)
        {
            query_L = queries[i][0] - 1;
            query_R = queries[i][1] - 1;
            query_K = queries[i][2];

            System.out.println("Result for Query " +
                    (i + 1) + " = " +
                    answerQuery(query_L, query_R,
                            query_K, arr));

        }
    }

    // Driver Code
    public static void main(String args[])
    {
        int arr[] = { 2, 4, 6,7 };
        int N = 4;

    /* queries[][] denotes the array
    of queries where each query has
    three integers
    query[i][0] -> Value of L for ith query
    query[i][0] -> Value of R for ith query
    query[i][0] -> Value of K for ith query */
        int queries[][] =
                {
                        { 4, 7, 2 },
                        { 2, 4, 1 }
                };
        int Q = queries.length;

        answerQueries(queries, Q, arr, N);
    }

}
