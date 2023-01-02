package util;

import entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//
//public class HibernateUtil {
//    private static final SessionFactory sessionFactory = buildSessionFactory();
//
//    public static SessionFactory buildSessionFactory() {
//
//       // Configuration config = null;
//        try {
//            return new Configuration()
//                    .configure("hibernate.cfg.xml")
//                    .addAnnotatedClass(Employee.class)
//                    .buildSessionFactory();
//        } catch (Exception e) {
//           throw e;
//           }
//    }
//    }
//
//    public static SessionFactory getSessionFactory(){
//        return sessionFactory;
//    }
//
//    public void close(){
//        sessionFactory.close();
//    }
//}


public class HibernateUtil {
    private final static SessionFactory sessionFactory;

        static {
                try {
                        sessionFactory = buildSessionFactory();
                } catch (Exception e) {
                        throw new RuntimeException(e);
                }
        }

        private static SessionFactory buildSessionFactory() throws Exception {
        try {
            return new Configuration()
                    .configure("hibernate.cft.xml")
                    .addAnnotatedClass(Employee.class)
                    .buildSessionFactory();
        } catch (Exception e) {
            throw e;
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void close() {
        sessionFactory.close();
    }
}












