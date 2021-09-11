package DEA.problem3;

public class ArticleDemo {
    public static void main(String[] args) throws Exception
    {
        Article article = new Article();
        article.addEntry("hi you");
        article.addEntry("you are awesome");
        System.out.println(article);

        DynamicContentFile dynamicContentFile = new DynamicContentFile();
        dynamicContentFile.save(article, "new-article.txt");
        dynamicContentFile.load("new-article.txt");
    }

}
