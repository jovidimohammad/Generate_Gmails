package Test;

import Utility.gmail;

public class sendGmails {
    public static void main(String[] args) {
        String username ="jmohammadismoil@gmail.com";
        String password ="Jovidgoogle2025";

        String[] Receiver ={"jmohammadismoil@gmail.com"};

        String Subject ="Jovid";
        String MSG ="Testing \n Hi how are you";

        for(String each : Receiver){
            gmail.sendEmails(username,password,each,Subject,MSG);
        }


    }

}
