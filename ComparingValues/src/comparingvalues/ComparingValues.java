package comparingvalues;

public class ComparingValues {
    public static void main(String[] args) {
        
        //Compare Equality
        String txt = "Fantastic ";
        String lang = "Java";
      
        //Assign test results 
        boolean state = (txt == lang);
        System.out.println("String Equality Test: " + state);
        
        //Compare Inequality      
        //Assign test results 
        state = (txt != lang);
        System.out.println("String Inequality Test: " + state);
        
        //Compare Integer Values
        int dozen = 12;
        int score = 20;
      
        //Assign test results for Greater than
        state = (dozen > score);
        System.out.println("Greater Than Test: " + state);
        
        //Assign test results for Less than
        state = (dozen < score);
        System.out.println("Less Than Test: " + state);    
    }
    
}
