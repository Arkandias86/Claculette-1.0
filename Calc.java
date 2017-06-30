/**
 * Created by Doudou on 30/06/2017.
 */
import java.util.Scanner;

public class Calc {

    public static double arrondi(double A, int B) {
        Math.round(A); // rounds the variable A
        return (double) ((int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1, number2, arroundAnswer, answer;
        char operator, redo;
        do{
            System.out.println("Bienvenu dans ma calculette 1.0");
            System.out.println("*******************************");
            System.out.println("Veuillez entrer un nombre:");

            number1 = sc.nextDouble();
            sc.nextLine();

            do{
                System.out.println("Veuillez entrer un opérateur au choix: * / + -");
                operator = sc.nextLine().charAt(0);
            }while( (operator != '*' && operator != '/' ) && (operator != '-' && operator != '+'));

            System.out.println("Veuillez entrer le deuxieme nombre:");
            number2 = sc.nextDouble();
            sc.nextLine();

            switch (operator)
            {
                case '*':
                    answer = number1 * number2;
                    arroundAnswer = arrondi(answer, 2);
                    System.out.println("Le résultat est "+arroundAnswer);
                    break;
                case '/':
                    answer = number1 / number2;
                    arroundAnswer = arrondi(answer, 2);
                    System.out.println("Le résultat est "+arroundAnswer);
                    break;
                case '-':
                    answer = number1 - number2;
                    arroundAnswer = arrondi(answer, 2);
                    System.out.println("Le résultat est "+arroundAnswer);
                    break;
                case '+':
                    answer = number1 + number2;
                    arroundAnswer = arrondi(answer, 2);
                    System.out.println("Le résultat est "+arroundAnswer);
                    break;
            }
            do{
                System.out.println("Voulez vous faire une autre opération? O/N");
                redo = sc.nextLine().charAt(0);
            }while( redo!= 'O' && redo!='N');
        }while(redo == 'O');
        System.out.println("Merci et à bientôt!");

    }
}