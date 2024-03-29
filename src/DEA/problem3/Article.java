package DEA.problem3;

import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Article {
    private final List<String> entries = new ArrayList<>();

    private static int count = 0;

    public void addEntry(String text)
    {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index)
    {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }



}