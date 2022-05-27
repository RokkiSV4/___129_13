/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import utility.Studentyi;


public class JavaApplication2 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SessionFactory sf= NewHibernateUtil.getSessionFactory();
       Session s = sf.openSession();
       Transaction t1 = s.beginTransaction();
       List <Studentyi> q = s.createQuery("from Studentyi s").list();
       for (Studentyi u:q)
       {
           System.out.print(u.getImya());
           u.setStatusDate(new Date());
           s.saveOrUpdate(u);
       }
       t1.commit();
       s.close();
    }

   
}
