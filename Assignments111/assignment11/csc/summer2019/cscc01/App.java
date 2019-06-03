package csc.summer2019.cscc01;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Document doc = Jsoup.connect("http://en.wikipedia.org/").get();
    }
}
