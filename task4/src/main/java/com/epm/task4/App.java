package com.epm.task4;
import java.util.Scanner;
public class App 
{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter price");
		double p=sc.nextDouble();
		System.out.println("enter rate of interest");
		double r=sc.nextDouble();
		System.out.println("enter time in years");
		double ti=sc.nextDouble();
		Simple si=new Simple(p,r,ti);
	 System.out.println("choose the constuction type you want");
	 System.out.println("1.standard material");
	 System.out.println("2.above standard material");
	 System.out.println("3.high standard material");
	 System.out.println("4.automated home");
	 int choice=sc.nextInt();
	 System.out.println();
	
	    System.out.println("enter the area of land in sqfeet");
	    double bal = sc.nextDouble();
	 
	 switch(choice)
	 {
	 case 1:
		 Standard s=new Standard();
		 s.standard(bal);
     	break;
     case 2:
    	 Standard t=new Standard();
		 t.above_standard(bal);
     	break;
     case 3:
    	 Standard o=new Standard();
		 o.high_standard(bal);
     	break;
     case 4:
    	 Standard pe=new Standard();
		 pe.automated_home(bal);
     	break;
	 }
	 System.out.println();
	 sc.close();
	}
}


