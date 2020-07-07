package org.example;

import org.example.data.AppUserDAO;
import org.example.model.AppUser;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 Spring IOC Project (W.E.)
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Project IOC" );

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AppUserDAO appUserDAO= context.getBean(AppUserDAO.class);

        System.out.println(appUserDAO.save(new AppUser(null,"testemail","testname","testaddress")));

        context.close();
    }
}
