import java.util.Random;
import java.util.Scanner;

public class Main {
    static String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789()*&^%!@#$_-+=<>?/[]";
    

    
    
    public static void main(String[] args) {                    
        selectAChar(ALPHA_NUMERIC_STRING);
        
        
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number one through 10.: ");
        
        int n = reader.nextInt();
        reader.close(); 
        
        while (true){
            // your code goes here
        }
        

        if(n == 0){
            System.out.println("Must be greater than 0");
        }
        
        if(n < 0){
            System.out.print("Number cannot be less than 0.");

        }

        if(n > 10){
            System.out.print("Number cannot be more than 10.");

        }

        if(n == 1) {
            System.out.println(selectAChar(ALPHA_NUMERIC_STRING));

        }
    
        if(n == 2){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }
    
        if(n == 3){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }

        if(n == 4){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }

        if(n == 5){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }

        if(n == 6){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }

        if(n == 7){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }

        if(n ==8){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }

        if(n == 9){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }

        if(n == 10){
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));
            System.out.print(selectAChar(ALPHA_NUMERIC_STRING));

        }


    
    
    }
    
    public static char selectAChar(String s){
        Random random = new Random();
        int index = random.nextInt(s.length());
        return s.charAt(index);
        
    }
    
}