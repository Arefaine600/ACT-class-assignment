import java.util.Scanner;
class MainJavaPoint {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please insert number ");
        int aNumber = scanner.nextInt();
        int reversedNumber = 0;
        for (; aNumber!=0; aNumber/=10){
            int remainder = aNumber%10;
            reversedNumber = reversedNumber*10 +remainder;


        }
        System.out.println("reversed number is : " + reversedNumber);


    }
}

