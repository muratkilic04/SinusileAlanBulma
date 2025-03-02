package Sinus;

import java.util.Scanner;

public class SinusAlanBulma {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		double a,b,aci,alan;
		System.out.println("Birinci kenarı girin:");
		a=input.nextDouble();
		System.out.println("İkinci kenarı girin:");
		b=input.nextDouble();
		System.out.println("Açıyı girin");
		aci=input.nextDouble();
		
		
		alan=a*b*Math.sin(aci*Math.PI/180)/2;
		
		System.out.println("Alan:"+alan);
		
		
	}

}
