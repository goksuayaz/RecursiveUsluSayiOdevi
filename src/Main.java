import java.util.Scanner;

public class Main {
    public static long pow(int x, int y){
        if(y == 0){
            return 1;
        }
        if(y % 2 == 0){
            long res = pow(x, y/2);
            return res * res;
        }else{
            return pow(x,y-1) *x;

        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int x,y;
        System.out.println("Taban Değerini Giriniz : ");
        x = inp.nextInt();
        System.out.println("Üs Değerini Giriniz : ");
        y = inp.nextInt();

        System.out.println("Sonuç : " + pow(x,y));
    }
}