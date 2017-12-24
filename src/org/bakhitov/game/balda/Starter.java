package org.bakhitov.game.balda;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mike on 19.12.2017.
 */
public class Starter {

    public static void main(String[] args)  throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Game game = context.getBean(Game.class);
        game.start();
        context.close();
    }
}
