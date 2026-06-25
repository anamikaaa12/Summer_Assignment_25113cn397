import java.util.Scanner;

public class ticketBookingSystem { 
    private boolean[] seats;

    public ticketBookingSystem(int totalSeats) {
        seats = new boolean[totalSeats]; // false means available, true means booked
    }

    public void displaySeats() {
        System.out.println("\nSeat Layout ([O] = Available, [X] = Booked):");
        for (int i = 0; i < seats.length; i++) {
            System.out.print("Seat " + (i + 1) + ":" + (seats[i] ? "[X]" : "[O]") + "  ");
            if ((i + 1) % 5 == 0) System.out.println();
        }
        System.out.println();
    }

    public void bookTicket(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number.");
            return;
        }
        if (!seats[seatNumber - 1]) {
            seats[seatNumber - 1] = true;
            System.out.println("Seat " + seatNumber + " booked successfully!");
        } else {
            System.out.println("Sorry, Seat " + seatNumber + " is already booked.");
        }
    }

    public void cancelTicket(int seatNumber) {
        if (seatNumber < 1 || seatNumber > seats.length) {
            System.out.println("Invalid seat number.");
            return;
        }
        if (seats[seatNumber - 1]) {
            seats[seatNumber - 1] = false;
            System.out.println("Booking for Seat " + seatNumber + " cancelled successfully.");
        } else {
            System.out.println("Seat " + seatNumber + " was not booked.");
        }
    }

    public static void main(String[] args) {
        ticketBookingSystem system = new ticketBookingSystem(10); // 10 available seats
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--- Ticket Booking Menu ---");
            System.out.println("1. View Seats\n2. Book Ticket\n3. Cancel Ticket\n4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: system.displaySeats(); break;
                case 2:
                    System.out.print("Enter seat number to book (1-10): ");
                    system.bookTicket(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Enter seat number to cancel (1-10): ");
                    system.cancelTicket(scanner.nextInt());
                    break;
                case 4: return;
                default: System.out.println("Invalid choice.");
            }
        }
    }
}
