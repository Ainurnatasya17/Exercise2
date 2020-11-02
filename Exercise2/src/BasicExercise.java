import java.util.Scanner;
public class BasicExercise {

	   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   
	   printExercise1();
	   printExercise2();
	   printExercise3();
	   printExercise4();
	   printExercise5();
	   printExercise6();
	   printExercise7();
	   printExercise8();
	   printExercise9();
	   printExercise10(); 
	   
   }
	   
	   public static void printExercise1() {
	   Scanner input = new Scanner(System.in);
	  
	   System.out.println("*****EXERCISE1*****");
	   
	   //input
	   System.out.print("Input the first number : ");
	   int num1 = input.nextInt();
	   System.out.print("Input the second number: ");
	   int num2 = input.nextInt();
	   
	   //culculate
	   int sum = num1 + num2;
			   
	   //output
	   System.out.println(" Sum:  "+ sum);
	   System.out.println();
	   	   
    }

	   public static void printExercise2() {
	   Scanner input = new Scanner(System.in);   
	  
	   System.out.println("*****EXERCISE2*****");
	   System.out.print("Input the radius of circle: ");
	   double radius = input.nextDouble();
	   
	   final double radius1 = 7.5;
	   double perimeter = 2 * Math.PI * radius1;
	   double area = Math.PI * radius1 * radius1;
	   
	   System.out.println(" Perimeter is = " + perimeter);
	   System.out.println(" Area is      = " + area);
	   System.out.println();
	   
    }
	   
	   public static void printExercise3() {
	   Scanner input = new Scanner(System.in);    
	   
	   System.out.println("*****EXERCISE3*****");
	   System.out.print("Input seconds   : ");
	   int seconds = input.nextInt();
	 
	   int p1 = seconds % 60;
	   int p2 = seconds / 60;
	   int p3 = p2 % 60; 
	   p2 = p2 / 60;
	   
	   System.out.println(" The seconds is : " + p2 + ":" + p3 + ":" + p1);
	   System.out.println();
	      
    }
	   
	   public static void printExercise4() {
	   Scanner input = new Scanner(System.in); 
	  
	   System.out.println("*****EXERCISE4*****");
	   System.out.print("Input the first number       : ");
	   int a = input.nextInt();
	   System.out.print("Input the second number      : ");
	   int b = input.nextInt();
	   int d = (a/b);
	   
       System.out.println(" The division of a and b is  : " + d);
	   System.out.println();  
	   
    }
	   
	   public static void printExercise5() {
	   Scanner input = new Scanner(System.in);    
	   
	   System.out.println("*****EXERCISE5*****");
	   
	   System.out.print("Input the first number  : ");
	   int num1 = input.nextInt();
	   
	   System.out.print("Input the second number : ");
	   int num2 = input.nextInt();
	   
	   System.out.println(  num1 + " x " + num2 + " = " + num1 * num2);
	   System.out.println();
	     
    }
	   
	   public static void printExercise6() {
	   Scanner input = new Scanner(System.in);   
	 
	   System.out.println("*****EXERCISE6*****");
	   System.out.print("Input a decimal number : ");
	 
	   int dec_num, rem;
	   String hexdec_num = "";
	   dec_num = input.nextInt();
	   
	   
	   /* hexadecimal number digits */
	   char hex[] = { '0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	   
	   while (dec_num>0)
	   {
		   
		   rem = dec_num % 16;
		   hexdec_num = hex [rem] + hexdec_num;
		   dec_num = dec_num / 16;
		   
	   }
	   
	   System.out.println(" Hexadecimal number is : " + hexdec_num + "\n");
	   System.out.println();
	   
    }
	   
	   public static void printExercise7() {
	   Scanner input = new Scanner(System.in);
	  
	   System.out.println("*****EXERCISE7*****");
	   System.out.print("Input number   : ");
	   
	   int n;
	   char s1, s2, s3;
	   n = input.nextInt();
	   
	   System.out.printf(" The number is : " + "%d + %d%d + %d%d%d\n" , n, n, n, n, n, n);
	   System.out.println();
  
    }
	   
	   public static void printExercise8() {
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("*****EXERCISE8*****");
	   System.out.print("Input the radius of rectangle : ");
	   double radius = input.nextDouble();
	   
	   final double width = 5.6;
	   final double height = 8.5;
	   
	   double perimeter = 2 * (height + width);
	   double area = width * height;
	   
	   System.out.printf(" Perimeter is : 2*(%.1f) = %.2f \n", height, width, perimeter);
	   System.out.printf(" Area is      : %.1f * %.1f = %.2f \n", width, height, area);
	   System.out.println();
	    
    }
	   
	   public static void printExercise9() {
	   Scanner input = new Scanner(System.in);
	  
	   System.out.println("*****EXERCISE9*****");
	   System.out.print("Input a octal number            : ");
	   
	   String octal_num, hex_num;
	   int decnum;
	   octal_num = input.nextLine();
	   
	   decnum = Integer.parseInt(octal_num, 8);
	   hex_num = Integer.toHexString(decnum);
	   
	   System.out.println(" Equivalent hexadecimal number  : "+ hex_num+"");
	   System.out.println();
	    
    }
	   
	   public static void printExercise10() {
	   Scanner input = new Scanner(System.in); 
	  
	   System.out.println("*****EXERCISE10*****");
	   System.out.print("Input first number  : ");
	   int num1 = input.nextInt();
	   
	   System.out.println("Input second number : ");
	   int num2 = input.nextInt();
	   
	   System.out.println( num1 + " + " + num2 + " = " + (num1 - num2));
	   System.out.println( num1 + " - " + num2 + " = " + (num1 - num2));
	   System.out.println( num1 + " x " + num2 + " = " + (num1 * num2));
	   System.out.println( num1 + " / " + num2 + " = " + (num1 / num2));
	   System.out.println( num1 + " mod " + num2 + " = " + (num1 % num2));
	   System.out.println();
	      
    }	   
	   
}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

