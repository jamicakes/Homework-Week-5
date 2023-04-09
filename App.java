package week5CodingHomework;

public class App {

  static Logger logger; 
  public static void main(String[] args) {

  Logger logger = new  AsteriskLogger();
  
    logger.log("Hello");
    logger.error("Hello");
    
    
    
    Logger logger1 = new SpacedLogger(); 
    
    logger1.log("Hello");
    logger1.error("Hello");
    
  }

}
