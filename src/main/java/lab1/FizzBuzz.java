package lab1;

//       PART 3 
	
	import java.util.Scanner;
import java.util.Arrays;

 public class Buz{
  public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("Please enter a positive integer");
   int i = scan.nextInt();  
}

  public static String[] fizzbuzz(final int n) { 
        if (n < 0){
            	System.out.println("Please enter valid number. ");
        }else{
         
      String Array[] = new String[n];
         for( int i = 1 ; i <= n ; i++){
         
         if(i % (5*3) == 0){
         Array[i - 1] = "FizzBuzz";
           }     
       
          else if(i % 3 == 0){
          Array[i - 1] = "Fizz";
            }
                
          else if(i % 5 == 0){
          Array[i - 1]= "Buzz";
            }    
         else {
          Array[i - 1]= String.valueOf(i);
           }
                
   	     }      
               return Array;  
        
     }
 }    

	
	
//                   PART2	

//  int n = 17;
//        for( int i = 1 ; i <= n ; ++i){
//          String str;
//          if(i % (5*3) == 0){
//              str = "FizzBuzz";
//          }else if(i % 3 == 0){
//              str = "Fizz";
//          }else if(i % 5 == 0){
//              str = "Buzz";
//          }else
//             str = Integer.toString(i);
//     System.out.println(str);
//        }
 //   }
//}