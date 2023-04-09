package week5CodingHomework;

public class AsteriskLogger implements Logger {

  
  public void log(String log) {
 
    System.out.println("***" + log + "***"); 
   
 
    
  }

  
  public void error(String error) {
System.out.println("******************" + "\n***Error: " + error + "***" + "\n******************");    
 
  }

}
