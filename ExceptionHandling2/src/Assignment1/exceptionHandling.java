package Assignment1;
import java.util.*;

public class exceptionHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Please enter no. of elements");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        try{
            for(int i=0;i<n;i++){
                System.out.println("Please enter element");
                arr[i] = sc.nextInt();
            }
        }
        catch(InputMismatchException e){
                System.out.println("Please enter integer value only");
        }
        
        System.out.println("Please enter index of elements which you want to print");
        int k = sc.nextInt();
       
        try{
            System.out.println("The element is :" + arr[k]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            
                System.out.println("Please enter correct index value and try again");
        }

	}

}
