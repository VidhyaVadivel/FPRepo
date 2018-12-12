package Torry;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Persist {

	public static void main(String[] args) {
		
		Configuration c = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = c.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction t = ss.beginTransaction();
		Person p = new Person();
		/*p.setId(1);
		p.setName("Gowri");
		p.setAge(21);
		p.setCity("Chennai");
		ss.persist(p);
		Person p2= new Person();
		p2.setId(2);
		p2.setName("Vidhya");
		p2.setAge(20);
		p2.setCity("Erode");
		ss.persist(p2);
		
		Person p3= new Person();
		p3.setId(3);
		p3.setName("VAISHAHI");
		p3.setAge(24);
		p3.setCity("COIMBATORE");
		ss.persist(p3);
		
		Person p4= new Person();
		p4.setId(4);
		p4.setName("ASVITHA");
		p4.setAge(22);
		p4.setCity("HOSUR");
		ss.persist(p4);*/
		
		/*Query q=ss.createQuery("update Person set age=24 where name='Vidhya'");
		q.executeUpdate();*/
		Query q=ss.createQuery("from Person");
		List l=q.list();
		Iterator<Person> itr = l.iterator();
		while(itr.hasNext()) {
			
			Person str=itr.next();
			System.out.println(str.getId());
			
		}
		//System.out.println(l.get(0)+" "+l.get(1));
		t.commit();
	}

}
