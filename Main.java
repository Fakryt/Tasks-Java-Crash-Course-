import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_of_task;
        
        while(true){
            System.out.println("Write number of task 1-11: ");
            number_of_task = scanner.nextInt();
            if(number_of_task > 11){
                System.out.println("Wrong number, end of programm!");
                break;
            }
            switch(number_of_task){
                case 1: Task1();
                case 2: Task2();
                case 3: Task3();

            }
            System.out.println("\n\n\nEnd of programm!");
            break;
        }
        
        
        
    }

    public static void Task1() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("The Task is:\n"+
        "~~~~~  Given positive numbers a, b, c, x, m. Find out if a brick with edges a, b, c will pass into a rectangular hole with sides x and y.\n" +
        "Pushing a brick into the hole is only allowed so that each of the ribs is parallel or perpendicular to each side of the hole.  ~~~~~\n");

        float a; float b; float c; float x; float y;
        System.out.println("Please, enter number a, b, c, x, y:");
        System.out.println("A:"); a = scanner.nextInt();
        System.out.println("B:"); b = scanner.nextInt();
        System.out.println("C:"); c = scanner.nextInt();
        System.out.println("X:"); x = scanner.nextInt();
        System.out.println("Y:"); y = scanner.nextInt();
        if (a == x){
            if(b == y){
                System.out.println("A = X AND B = Y");
            }
            else if (c == y){
                System.out.println("A = X AND C = Y");
            }
            else{
                System.out.println("A = X but not another NUMBERS!");
            }
        } else if (b == x){
            if(a == y){
                System.out.println("B = X AND A = Y");
            }
            else if (c == y){
                System.out.println("B = X AND C = Y");
            }
            else{
                System.out.println("B = X but not another NUMBERS!");
            }
        } else if (c == x){
            if(a == y){
                System.out.println("C = X AND A = Y");
            }
            else if(b == y){
                System.out.println("C = X AND B = Y");
            }
            else{
                System.out.println("C = X but not another NUMBERS!");
            }
        } else{
            System.out.println("Not any numbers is equal");
        }
    }

    public static void Task2() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("The Task is:\n"+
        "~~~~~ Given a natural number n:\n"+
        "a) Find out if the number 3 is included in the notation of the number n^3.\n"+
        "b) Change the order of the digits of the number and vice versa.\n"+
        "c) Swap the first and last digits of n.\n"+
        "d) Attribute one at the beginning and at the end of the record of the number n.  ~~~~~\n");

        //a):
        System.out.println("Please, enter n:"); double n = scanner.nextInt();
        System.out.println("a):");
        double power = Math.pow(n, 3);
        String number_A = Double.toString(power);
        String o = "3";
        boolean does_contain = number_A.contains(o);
        if(does_contain){
            System.out.println("Contains!");
        }else{
            System.out.println("Doesn't contain!");
        }

        //b):
        System.out.println("b):");
        String number_B = Double.toString(n);
        char[] array_B = number_B.toCharArray();
        String finnal_B = "";
        for(int i = array_B.length - 3; i >= 0; i--){
            finnal_B = finnal_B + array_B[i];
        }
        System.out.println(finnal_B);

        //c):
        String number_C = Double.toString(n);
        System.out.println("c):");
        System.out.println(number_C.substring(1, number_C.length()-3));

        //d):
        System.out.println("d):");
        String number_D = Double.toString(n);
        number_D = "1" + number_D.substring(0, number_D.length()-2) + "1";
        System.out.println(number_D);
    }

    public static void Task3() {
        Scanner scanner = new Scanner(System.in);

        //a):
        System.out.println("a):\nEnter radius:");
        int r = scanner.nextInt();
        double perimeter = 2 * r * Math.PI;
        double square =  Math.PI * Math.pow(r, 2);

        System.out.println("Perimeter: " + perimeter + "\nSquare: " + square);

        //b):
        String name, adress;
        System.out.println("b):\nWhat is your name?");
        name = scanner.next();
        System.out.println("Where are you live, "+ name + "?");
        adress = scanner.next();

        System.out.println("Your name is " + name + ". You are living at " + adress + "!");

        //c):-

    }

    public static void Task4(){
        
    }
}
