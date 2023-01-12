import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        System.out.print("Bir sayi giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i<=sayi; i*=4){
            System.out.println("4 'ün Kuvvetleri : " +i);
        }
        System.out.println("--------------");
        for (int j = 1; j<=sayi; j*=5){
            System.out.println("5'in Kuvvetleri : " +j);
        }

    }
}
