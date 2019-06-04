package csc.summer2019.cscc01;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser {
  
  public String getTitle (Document doc) {
    return (doc.title());
  }
  
  public Elements getATagElements (Document doc) {
    return (doc.getElementsByTag("a"));
  }

}
