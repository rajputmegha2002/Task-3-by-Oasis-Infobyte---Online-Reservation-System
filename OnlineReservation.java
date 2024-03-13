import java.util.*;

class Train {

    String loginId = "Megharajput";
    String password = "pass@123";

    public void Login() {

        System.out.println("\nEnter a valid Login Id And Password: ");
        System.out.print("Login ID :  ");

        Scanner sc = new Scanner(System.in);
        String LoginId = sc.next();

        System.out.print("Password :  ");
        String Password = sc.next();

        if (loginId.compareTo(LoginId) == 0 & password.compareTo(Password) == 0) {

            System.out.println("\nlogin Successfully: ");
            Traindetails();

        } else {

            System.out.println("\nEnter Correct Login ID & Password: ");
            Login();
        }
    }

    public void Traindetails() {

        System.out.println("\nEnter Train details:");

        System.out.print("Enter Train Number:   ");

        Scanner sc = new Scanner(System.in);
        int Train_No = sc.nextInt();

        if (Train_No == 1111) {

            System.out.println("\nNavjeevan SF Express");
            Seat();
        } else if (Train_No == 2222) {

            System.out.println("\nGitanjali Express");
            Seat();
        } else if (Train_No == 3333) {

            System.out.println("\nMaharashtra Express");
            Seat();
        } else if (Train_No == 4444) {

            System.out.println("\nMumbai LTT Express");
            Seat();
        } else {

            System.out.println("\nEnter a Valid train Number: ");
            Traindetails();
        }
    }

    public void Seat() {

        System.out.print("\nEnter Class Type you Want to Reserve Ticket...?");
        Scanner sc = new Scanner(System.in);
        String Class_Type = sc.nextLine();

        System.out.print("\nEnter the date of your journey:   ");
        String Date = sc.nextLine();

        System.out.print("\nEnter Start Station: ");
        String From_To = sc.next();

        System.out.print("\nTo Destination Station: ");
        String Destination = sc.next();

        System.out.println("\nWrite insert to Save the details: ");
        String insert = sc.next();
        String name2 = "insert";

        if (insert.compareTo(name2) == 0) {

            System.out.println("\nYour Details Saved Successfully: ");
            Reserve();
        }
    }

    public void Reserve() {

        System.out.println(
                "\nIf you Want to RESERVE Ticket For This train Type 1 Else Type 0 to CANCEL your Reservation:\n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("Reservation Done Successfully...! ");
            System.out.println("Happy Journey...!\n");
        } else {
            System.out.println("your Resrevation Cancel Successfully...!\n");
        }

    }
}

public class OnlineReservation {
    public static void main(String[] args) {

        Train obj = new Train();
        obj.Login();

    }

}
