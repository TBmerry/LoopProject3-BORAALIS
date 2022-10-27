import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        a = input.nextInt();

        for (int i = 1; i <= a; i*=4){
            System.out.println("4 ün kuvvetleri ;" + i);
        }

        System.out.println("---------------------------");

        for (int i = 1; i <= a; i*=5){
            System.out.println("5 in kuvvetleri ; " + i);
        }
    }
}