package com.hibernate.main;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.hibernate.StudentDetails;

public class HibernateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Transaction t=s.beginTransaction();
		StudentDetails std1=new StudentDetails(20550,"Raj",85);
		StudentDetails std2=new StudentDetails(20551,"Sohan",91);
		StudentDetails std3=new StudentDetails(20550,"Ganesh",76);
		StudentDetails std4=new StudentDetails(20550,"Rohith",90);
		StudentDetails std5=new StudentDetails(20550,"Bala",79);
		s.save(std1);
		s.save(std2);
		s.save(std3);
		s.save(std4);
		s.save(std5);
		Query maxmark=s.createQuery("select max(stdmark) from StudentDetails");
		Query equalmarks=s.createQuery("select stdname from StudentDetails where stdmark=94");
		Query between=s.createQuery("from StudentDetails s where s.stdmark between :start and :end");
		between.setParameter(80, 90);
		Query like=s.createQuery("from StudentDetails where stdname like 'S%'");
		Query query=s.createQuery("from StudentDetails"); 
		List list=(List) query.list();
		System.out.println(list);
		t.commit();
		s.close();
	}

}
