
package org.example;

import org.example.AppConfig.AppConfigAuth;
import org.example.data.AppUserDAO;
import org.example.model.AppUser;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

/**
 Spring IOC Project (W.E.)
 */
        public class App
        {
            public static void main( String[] args )
            {
                System.out.println( "Spring Project IOC" );
            // @@ 1 Annotate usage
                AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigAuth.class);

                AppUserDAO appUserDAO = context.getBean(AppUserDAO.class);

                System.out.println(appUserDAO.save(new AppUser( "testEmailAnnotat","1234","testNameAnnotat","testaddressAnnotate")));

            //@@ 2 displaying another bean from AppConfigAuth class
                Scanner scanner = context.getBean(Scanner.class);
                System.out.println("Enter Something");
                System.out.println(scanner.nextLine());


                context.close();

    }
}

//JAVA ANNOTATION CONFIG WITH CONFIGURATION CLASS DEMO
// 1 when we are using Annotate method (which is modern appraoch) we define a CONFIG class (AppConfigAuth here) to call in the first line above.
// 2 we will write @Component in the REPOSITORY of interface class(AppUserinMemoryStorage here) SINCE we will create object of this type in App above
// 3 We will mark @Configuration and @Component Scan BEFORE class decl. in AppConfig file + Package link .
// Secondly we will use AnnontationConfig..... command in App
