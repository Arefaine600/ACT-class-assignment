import java.util.Scanner;
class MainExercise2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert number ?");
        int number = scanner.nextInt();
        if ((number%2==0)&&(number%3==0) && (number%6==0)){
            System.out.println("yes");

        } else {
            System.out.println("null");
        }
    }
}