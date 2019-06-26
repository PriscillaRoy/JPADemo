package com.jpatelusko.JPADemo;

import java.util.Random;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.mysql.cj.x.protobuf.MysqlxCrud.Find;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
  
	    EntityManagerFactory eFactory = Persistence.createEntityManagerFactory("pu");
	    EntityManager eManager = eFactory.createEntityManager();
	    //Finding the obj
	    Professional pro = eManager.find(Professional.class, 4);
	    System.out.println(pro);
	    
	    
	    //Saving an obj
//	    Professional pro = new Professional();
//	    pro.setId(6);
//	    pro.setProname("Annie");
//	    pro.setTech("JPA");
//	    eManager.getTransaction().begin();
//	    eManager.persist(pro);
//	    eManager.getTransaction().commit();
//	    System.out.println(pro);
	  
    }
}
