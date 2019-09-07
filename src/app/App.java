package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        float x, y;
        char operator;

        Scanner scan = new Scanner(System.in);

        x = scan.nextFloat();
        operator = scan.next().charAt(0);
        y = scan.nextFloat();
        
        scan.close();

        if (operator == '+') {
            System.out.println(String.format("%.2f", x + y));
        }else if(operator == '-'){
            System.out.println(String.format("%.2f", x - y));
        }else if(operator == '*'){
            System.out.println(String.format("%.2f", x * y));            
        }else if(operator == '/'){
            System.out.println(String.format("%.2f", x / y));            
        }
    }
}