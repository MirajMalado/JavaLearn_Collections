import java.util.*;
public class Collection1 {
  public static void main(String[] args) {
    
    List<String> livre = new ArrayList<String>();
    livre.add("Une si longue lettre");
    livre.add("Pere Goriot");
    livre.add("Les Miserables");
    livre.add("Dragon Ball Z");
    for (String book : livre) {
      System.out.println(book);
    }
 }
}