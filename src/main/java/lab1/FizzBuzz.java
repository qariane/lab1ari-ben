package lab1;

public class FizzBuzz{
	
    public static void main(String[] args){
   int n = 17;
        for( int i = 1 ; i <= n ; ++i){
            String str;
            if(i % (5*3) == 0){
                str = "FizzBuzz";
            }else if(i % 3 == 0){
                str = "Fizz";
            }else if(i % 5 == 0){
                str = "Buzz";
            }else

                str = Integer.toString(i);

            System.out.println(str);
        }
    }
}
