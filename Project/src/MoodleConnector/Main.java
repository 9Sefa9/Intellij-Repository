package MoodleConnector;

import java.util.Scanner;

public class Main {
    public static void main(String[] a) throws Exception {
        Scanner input = new Scanner(System.in);
        String decision,password,username;
        System.out.println("Moodle Connector v1.0 by MNRNDK");
        System.out.println("--------------------------------");
        System.out.println("1.Connect to Moodle");
        System.out.println("2.Quit");
        System.out.print("::=>");
        decision = input.nextLine();
        switch(decision){
            case "1": {
                System.out.print("USERNAME: ");
                username = input.nextLine();
                System.out.print("PASSWORD: ");
                password = input.nextLine();
                System.out.println("loading...");
                Login http = new Login();
                http.createWebsite("https://moodle.uni-due.de/login/");
                http.loginToWebsite(username,password);
                input.close();
                break;
                }
            case "2":{
                      System.out.println("QUIT...");
                      break;
                     }
            default: {
                System.out.println("Wrong Number! try again...");
                main(a);
            }
        }
    }
}
