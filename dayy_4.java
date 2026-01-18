public static void main(String[] args) {
    int choice;
    do {
        System.out.println("\n--- Customer Complaint Portal ---");
        System.out.println("1. Add Complaint");
        System.out.println("2. View Complaints");
        System.out.println("3. Exit");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1: addComplaint(); break;
            case 2: viewComplaints(); break;
            case 3: System.out.println("Thank you!"); break;
            default: System.out.println("Invalid choice!"); break;
        }
    } while (choice != 3);
}
