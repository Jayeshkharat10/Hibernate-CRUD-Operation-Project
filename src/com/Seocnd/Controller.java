package com.Seocnd;

import java.util.Scanner;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {
	
	private int id;
	private String name;

	public void insert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id ...");
		this.id =sc.nextInt();
		System.out.println("enter your name .....");
		this.name=sc.next();
		
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t= ss.beginTransaction();
		Student s1= new Student(id,name);
		ss.save(s1);
		System.out.println("data insereted...");
		t.commit();
		ss.close();
		
		
	}
	
	public void update() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id ...");
		this.id =sc.nextInt();
		System.out.println("enter your name .....");
		this.name=sc.next();
		
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t= ss.beginTransaction();
		Student s2= new Student(id,name);
		ss.update(s2);
		System.out.println("data updated......");
		t.commit();
		ss.close();
		
		
	}
	public void delete() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id ...");
		this.id =sc.nextInt();
		System.out.println("enter your name .....");
		this.name=sc.next();
		
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction t= ss.beginTransaction();
		Student s3= new Student(id,name);
		ss.delete(s3);
		System.out.println("data deleted...");
		t.commit();
		ss.close();
	}
	
	public void show() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your id ...");
		this.id =sc.nextInt();
		
		Configuration cfg= new Configuration();
		cfg.addAnnotatedClass(Student.class).configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		Student s4= ss.get(Student.class, id);
		System.out.println("show data "+s4);
		
	}
	
	
	}