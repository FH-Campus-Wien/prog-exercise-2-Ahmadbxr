package at.ac.fhcampuswien;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner sc = new Scanner(System.in);
        double a;
        double b = 0;
        int y = 1;

        do {
            System.out.print("Number " + y + ": ");
            a = sc.nextDouble();

            if (a < 0 && y == 1) {
                System.out.println("No number entered.");
                return;
            } else if (a > b) {
                b = a;
            }
            y++;
        }
        while (1 < a);
        DecimalFormat df = new DecimalFormat("0.00##");
        System.out.println("The largest number is " + df.format(b));

    }



    //todo Task 2
    public void stairs(){
        Scanner sc = new Scanner(System.in);
        int x = 1;
        System.out.print("n: ");
        int y = sc.nextInt();

        if(y < 0) {
            System.out.println("Invalid number!");
            return;
        }
        for (int i = 0 ; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (i >= j) {
                    System.out.print(x + " ");
                    x++;
                }
            }
            System.out.println();
        }
    }

    //todo Task 3
    public void printPyramid(){
        int x = 6;

        for (int j = 1; j <= x; j++){
            for (int k = x; k > j; k--){
                System.out.print(" ");
            }
            for (int l = 1; l <= (j * 2) - 1; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        Scanner sc = new Scanner(System.in);
        System.out.print("h: ");
        int h = sc.nextInt();
        System.out.print("c: ");
        char c = sc.next().charAt(0);

        if (h % 2 == 0){
            System.out.print("Invalid number!");
            System.out.println();
            return;
        }
        for(int i = 1; i < h / 2 + 2; i++){
            for(int j = 0; j < h / 2 - i + 1; j++){
                System.out.print(" ");
            }
            for(int k = i; k >= 1; k--){
                char aug = (char) (c + 1 - k);
                System.out.print(aug);
            }
            for (int l = 2; l <= i; l++){
                char aug2 = (char) (c + 1 - l);
                System.out.print(aug2);
            }
            System.out.println();
        }

        for(int i = 0; i < h / 2; i++){
            for (int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for (int k = i; k <= h / 2 - 1; k++) {
                char aug = (char) ((c-h/2+1)+k);
                System.out.print(aug);
            }
            for (int k = i; k <= h/2-2; k++){
                char aug2 = (char) (c-1-k);
                System.out.print(aug2);
            }
            System.out.println();
        }
    }

    //todo Task 5
    public void marks(){
        Scanner sc = new Scanner(System.in);
        int note;
        int neg = 0;
        double avr = 0;
        int i = 1;

        do {
            System.out.print("Mark " + i + ": ");
            note = sc.nextInt();
            avr = avr + note;

            if(note < 0 || note > 5) {
                System.out.println("Invalid mark!");
                i--;
                avr = avr - note;
            } else if (note == 0 ) {
                i--;
            } else if (note == 5) {
                neg++;
            } else if (note == 0 && i == 1 ) {
            }
                i++;

        } while (note > 0);
        i = i - 1;
        avr = avr / i;
        if (Double.isNaN(avr)){
            avr = 0;
        }
        System.out.printf("Average: %.2f", avr);
        System.out.println();
        System.out.println("Negative marks: " + neg);
        }

    //todo Task 6
    public void happyNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int numb = sc.nextInt( );
        int erg = numb;
        while (erg != 1 && erg != 4) {
            erg = happynumber(erg);
        }
        if (erg == 1) {
            System.out.println("Happy number!");
        } else {
            System.out.println("Sad number!");
        }
    }
    public static int happynumber (int numb) {
            int x = 0, sum = 0;
            while (numb > 0){
                x = numb %10;
                sum = sum + (x*x);
                numb = numb/10;
            }
            return sum;
        }


    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}