import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.io.*;

public class lab3class {


    /**
     * Retrieve contents from a URL and return them as a string.
     *
     * @param url url to retrieve contents from
     * @return the contents from the url as a string, or an empty string on error
     */
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String str = urlToString("https://cs.illinois.edu/");
        int l = str.length();
        System.out.println("length is :" + l);
      //  String str = "rishika is my name";

        int count = 1;
        for (int i=0;i<=str.length()-1;i++)
        {
            if (str.charAt(i) == ' ' && str.charAt(i+1)!=' ')
            {
                count++;
            }
        }

        System.out.println("word count is :" + count);

        }

}
