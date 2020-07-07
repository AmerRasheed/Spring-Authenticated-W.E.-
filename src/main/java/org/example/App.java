package org.example;

import org.example.config.javaConfigMod;
import org.example.data.AppUserDAO;
import org.example.data.AppUserInMemoryStorage;
import org.example.model.AppUser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 Spring IOC Project (W.E.)
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(javaConfigMod.class);

        AppUserDAO appUserDAO = context.getBean(AppUserDAO.class);

        System.out.println( appUserDAO.save(new AppUser("javaConfigTestEmail","1234","javaconfigaddress", "javaconfigAddress")));

        context.close();
    }
}
