static void viewComplaints() {
    if (count == 0) {
        System.out.println("No complaints found.");
    } else {
        System.out.println("\nID | Name | Issue");
        System.out.println("------------------------");
        for (int i = 0; i < count; i++) {
            complaints[i].display();
        }
    }
}
