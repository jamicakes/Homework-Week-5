package week5CodingHomework;

public class SpacedLogger implements Logger {

  
  public void log(String log) {
    
  //  for (int i = 0; i  <= log.length() -1; i++) {
     
    System.out.println(log.replaceAll(".(?=.)", "$0 "));
      
      
    }
    
  // Explanation "Replace all characters (except the last one) with with the character itself followed by a space".
  // code help from https://stackoverflow.com/questions/7189293/add-spaces-between-the-characters-of-a-string-in-java
  
  public void error(String error) {
  //  for (int i = 0; i  <= error.length() -1; i++) {
      System.out.println("ERROR: " + error.replaceAll(".(?=.)", "$0 "));
     
  }

}
  

