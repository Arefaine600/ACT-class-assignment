import java.util.Scanner;











class MainExercise4{
    public static void main(String[] args) {
         double a = 0.0;
         double b = 90.0;
         double c = 180.0;
         Scanner scanner = new Scanner(System.in);
        System.out.println("first angle ?");
        double x = scanner.nextDouble();
        System.out.println("second angle ?");
        double y = scanner.nextDouble();
        System.out.println("third angele");
        double z = scanner.nextDouble();

        if (((x==b)||(y==b)||(z ==b)) && ((x + y +z) == 180.0) )   {
            System.out.println("right angle triangle");
        } else if(((b<x && x>a) && (b<y && y>a) &&(b<z && z>a)) && ((x + y +z) == 180.0) ){
            System.out.println("acute angle triangle");
        } else if((((c<x && x>b)||(c<y && y>b)||(c<z && z>b))) && ((x + y +z) == 180.0 )){
            System.out.println("obtuse angle triangle");
        }
        else{
            System.out.println("null");
        }
    }
}

