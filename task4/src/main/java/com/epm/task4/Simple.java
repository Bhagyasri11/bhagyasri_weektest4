package com.epm.task4;
import java.lang.Math;

public class Simple  {
	Simple(double price,double rate,double time)
	{
       double  sim=(price*rate*time)/100;
        double com=price*Math.pow(1.0+rate/100.0,time);
        System.out.println("simple interest="+sim);
        System.out.println("compound interest="+com);
        
	}
}
