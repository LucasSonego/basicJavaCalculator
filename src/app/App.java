package app;

import java.util.Scanner;

import operations.Add;
import operations.Mult;
import operations.Sub;
import operations.Div;

public class App {
    public static void main(String[] args) throws Exception {
        double x = 0, y = 0;
        char operator = '?';

        Scanner scan = new Scanner(System.in);

        boolean exit1 = false;

        while (exit1 != true) {
            System.out.println("Insert a number\nThen insert an operator ( + - * / )\nAnd then insert another number ");
            x = scan.nextFloat();
            operator = scan.next().charAt(0);
            y = scan.nextFloat();

            if ((operator == '+') || (operator == '-') || (operator == '*')) {
                exit1 = true;
            } else if (operator == '/') {
                if(y != 0){
                    exit1 = true;
                }else{
                    System.out.println("You can't divide by 0!");
                    System.out.println("Let's try once again...");
                }
            }else{
                System.out.println("Invalid operator");
            }
        }

        scan.close();

        if (operator == '+') {
            Add add = new Add();
            add.calculate(x, y);
        } else if (operator == '-') {
            Sub sub = new Sub();
            sub.calculate(x, y);
        } else if (operator == '*') {
            Mult mult = new Mult();
            mult.calculate(x, y);
        } else if (operator == '/') {
            Div div = new Div();
            div.calculate(x, y);
        }
    }
}