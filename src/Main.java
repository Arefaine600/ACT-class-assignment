class MainFizzBuzz{
    public static void main(String[] args) {
        for(int number = 0; number <= 100; ++number){
            if((number % 3 == 0) && (number % 5 == 0)){
                System.out.println("FIZZBUZZ");
            } else if(number % 3 == 0){
                System.out.println("FIZZ");
            } else if(number % 5 == 0){
                System.out.println("BUZZ");
            }  else{
                System.out.println(number);
            }

    }
}
}