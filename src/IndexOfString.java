private static  int  indexOf(String a, String b) {
        String s1 = a;
        String s2 = b;
        if (a.length() < b.length()) {
            s1 = b;
            s2 = a;
        }
        for (int i = 0 ; i < s1.length();) {
            if (s1.charAt(i) == s2.charAt(0)) {
                if (i + s2.length() <= s1.length()) {
                    String temp = s1.substring(i, i + s2.length());
                    if (temp.equals(s2)) {
                        return i;
                    }
                }

            }
            i++;
        }
        return -1;
    }