package com.peaksoft;

import entity.Employee;
import org.hibernate.Session;
import util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
     Employee employee = new Employee();
     employee.setFirstName("Syimyk");
     employee.setLastName("Avasov");
     employee.setAge(18);
     create(employee);
    }
    public static Long create(Employee e){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(e);
        session.getTransaction().commit();;
        session.close();
        return e.getId();
    }
}
