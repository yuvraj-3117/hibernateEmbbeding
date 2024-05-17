package com.emmbeding;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Emdemo {
	
	public static void main (String [] args) {
		

		Configuration cfg = new Configuration();

		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		
		Student2 s1 = new Student2();
		s1.setId(12345);
		s1.setName("yuvraj patel");
		s1.setCity("barwaha");
		
		Certificate certificate = new Certificate();
		certificate.setCourse("andriod");
		certificate.setDuration("2 months");
		
		s1.setCerti(certificate);  //refrence ke throw refer kr liya
		
		
		
		Student2 s2 = new Student2();
		s2.setId(12565);
		s2.setName("ravi patel");
		s2.setCity("dehli");
		
		Certificate certificate1 = new Certificate();
		certificate1.setCourse("hibernate");
		certificate1.setDuration("1.4 months");
		
		s2.setCerti(certificate1);  //refrence ke throw refer kr liya
		//now data save by helg of hibernate
		Session s = factory.openSession();
		//permanat data store krne kew liya
		Transaction tx = s.beginTransaction();
		
		//object save
		s.save(s1);
		s.save(s2);
		
		tx.commit();
		
		s.close();
		
		factory.close();
	}

}
