import java.util.Scanner;

public class CCPMain {
    static Complaint[] complaints = new Complaint[10];
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Customer Complaint Portal Initialized.");
    }

    static void addComplaint() {
        if (count < complaints.length) {
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Issue: ");
            String issue = sc.nextLine();

            complaints[count] = new Complaint(id, name, issue);
            count++;

            System.out.println("Complaint Added Successfully!");
        } else {
            System.out.println("Complaint list full (Max 10 complaints)");
        }
    }
}
