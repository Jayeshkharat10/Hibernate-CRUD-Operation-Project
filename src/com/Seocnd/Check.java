package com.Seocnd;

import java.util.Scanner;

public class Check {
   
	public static void main(String[] args) {
		System.out.println("1.Insert                   2.update ");
		System.out.println("3.delete                   4.Show   ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice :  ");
		int a=sc.nextInt();
		
		if (a==1) {
			Controller cc=new Controller();
			cc.insert();
		}
		else if(a==2) {
			
			Controller cc=new Controller();
			cc.update();
		}
		else if(a==3) {
			
			Controller cc=new Controller();
			cc.delete();
		}
		else if(a==4) {
		    Controller cc=new Controller();
		    cc.show();
		}
		else {
			System.out.println("invalid input ....try again.");
		}
		
		//cc.insert(111, "jayesh");
		//cc.insert(333, "praful");
		//cc.update(111, "shubham");
		//cc.delete(111, "shubham");
		//cc.show(222);
		//cc.insert(444, "vikas");
		//cc.show(444);
		//cc.insert(201, "aaaaaaaa");
		//cc.insert();
		//cc.show();
		//cc.update();
		//cc.show();
		//cc.delete();
	}
}
