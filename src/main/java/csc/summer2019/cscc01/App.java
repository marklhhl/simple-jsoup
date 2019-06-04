package csc.summer2019.cscc01;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class App 
{
    public static void main( String[] args )
    {
        Parser parser = new Parser();
        // loop through each url input
        for (int i = 0; i < args.length; i++) {
          try {
            // using jsoup to turn the html into a Document object
            Document doc = Jsoup.connect(args[i]).get();
            
            // print out the url
            System.out.println("URL: "+args[i]);
            // print out title of current document
            System.out.println("Title: "+parser.getTitle(doc));
            
            // get all html elements with tag <a>, and print out
            // their link and text
            Elements links = parser.getATagElements(doc);
            
            System.out.println("\n");
            for (Element link : links) {
              System.out.println("Link: "+link.attr("href"));
              System.out.println("Text: "+link.text());
              System.out.println("\n");
            }
          } catch (IOException e) {
            // catch exception
            System.out.println("error with parsing "+args[i]);
          }
        }
    }
}
