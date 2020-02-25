package learnJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FastInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a String");
		String str = input.readLine();
		System.out.println("Enter a number");
		int num = Integer.parseInt(input.readLine());
		System.out.println(str);
		System.out.println(num);

		
		
		
		

	}

}
