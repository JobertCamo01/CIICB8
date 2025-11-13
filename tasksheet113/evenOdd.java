package tasksheet113;

public class evenOdd {
    public static void main(String[] args) {
        
        int check_number = 10;
        String message = null;

        for(int i = 1; i <= check_number; i++){
            message = (i%2 == 0) ? i + " is even number" : i + " is odd number";
            System.out.println(message);   
        }
        
    }
}
