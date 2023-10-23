
import java.util.Scanner;
public class q1 {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("Enter the number:=");
        int num=sc.nextInt();
        System.out.println("Given Number :=" +num);
        
        String n=Integer.toBinaryString(num);
        System.out.println(n);
        //        System.out.println(Integer.toBinaryString(num));
	    
        String n1=Integer.toOctalString(num);
        System.out.println(n1);

        String n2=Integer.toHexString(num);
        System.out.println(n2);
	}

}

