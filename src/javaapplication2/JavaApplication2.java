/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;


public class JavaApplication2 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SessionFacroty sf= NewHibernateUtil.getSessionFactory();
       Session s = sf.openSession();
       Transaction t1 = s.beginTransaction();
       t1.commit();
       s.close();
    }

   
}
