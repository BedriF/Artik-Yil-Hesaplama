import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toplam = 0;
        int j = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz : ");
        int k = input.nextInt();

            if (0==k%4) {
                if(0==k%100&&0==k%400){
                System.out.println(+k+ " bir artık yıldır ! " );
            }else if(0==k%100){
                System.out.println(+k+ " bir artık yıl değildir ! " );
            }else {
                    System.out.println(+k + " bir artık yıldır ! ");
                }
    }else{
                System.out.println(+k+ " bir artık yıl değildir ! " );
}
    }
}