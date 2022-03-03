package java.az.iktlab.seproject.group.overriderrs.project.application;




import java.az.iktlab.seproject.group.overriderrs.project.controller.FlightController;
import java.az.iktlab.seproject.group.overriderrs.project.controller.bookController;
import java.util.Scanner;


public class ConsoleRunner {
    protected static final Scanner sc = new Scanner(System.in);
    public static void runConsole(){

        int command= sc.nextInt();
        System.out.println("Please Enter number:");
        ProjectApplication a = new ProjectApplication();


        while (true){
            switch (command){
                case 1:
                    FlightController.show();
                    break;
                case 2:
                    FlightController.info();
                    break;
                case 3:
                    bookController.book();
                    break;
                case 4:
                    bookController.cancel();
                    break;
                case 5:
                    FlightController.flights();
                    break;
                case 6:
                    System.out.println("- Thanks for choosing us\n");
                    break;
            }
        }
    }
}
