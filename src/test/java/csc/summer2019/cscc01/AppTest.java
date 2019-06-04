package csc.summer2019.cscc01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws IOException 
     */
    @Test
    public void testTitle() throws IOException
    {
        Parser parser = new Parser();
        Document doc = Jsoup.connect("http://www.simplehtmlguide.com").get();
        assertEquals("A Simple Guide to HTML - Welcomesss", parser.getTitle(doc));
    }
    
    @Test
    public void testOneHrefLink() throws IOException
    {
        Parser parser = new Parser();
        Document doc = Jsoup.connect("http://www.simplehtmlguide.com").get();
        Elements aTags = parser.getATagElements(doc);
        assertEquals("essential.php", aTags.get(1).attr("href"));
    }
    
    @Test
    public void testOneText() throws IOException
    {
        Parser parser = new Parser();
        Document doc = Jsoup.connect("http://www.simplehtmlguide.com").get();
        Elements aTags = parser.getATagElements(doc);
        assertEquals("html guide", aTags.get(1).text());
    }
    
    @Test
    public void testURL()
    {
        // at this point, i realize i don't need the test file, hence this test class
        // dosent make sense.
        assertTrue( true );
    }
}
