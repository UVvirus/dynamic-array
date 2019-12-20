import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		System.out.println("Enter the size of array");
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		
		//
		String Array[]=new String[size];
		System.out.println("enter the elements");
		for( i=0;i<size;i++) {
			Array[i]=scan.next();
		}
		System.out.println(Arrays.toString(Array));
        ArrayList<String>newElement=new ArrayList<String>(Arrays.asList(Array));
        System.out.println("Enter the  element to be added");
        String elements=scan.next();
        newElement.add(elements);
        Array=newElement.toArray(Array);
        System.out.println(Arrays.toString(Array));
	}

}
