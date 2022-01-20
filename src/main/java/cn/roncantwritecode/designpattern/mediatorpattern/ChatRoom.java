package cn.roncantwritecode.designpattern.mediatorpattern;

import java.util.Date;

/**
 * @author Ron Wu
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
