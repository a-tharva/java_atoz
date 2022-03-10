import java.util.Scanner;

public class TicketBooking {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int[] SeatNo = new int[30];
        int Seats;
        int Choice = 1;
        String Name;
        
        while (Choice == 1) {
            System.out.print("Welcome to ticket booking!\nWhat is your name\n");
            Name = input.nextLine();

            for (int i=1; i<=34; i++) {
                System.out.print("*");
            }
            
            System.out.printf("Welcome %s Have a look at the seating", Name);

            for (int i=1; i<=34; i++) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print("Seating plan");
            System.out.println();

            for (int SeatCounter = 0; SeatCounter < SeatNo.length; SeatCounter++) {
                System.out.printf(SeatCounter + "\t");

                if ( (SeatCounter+1) % 5 == 0) {
                    System.out.println();
                }
            }

                for (int k = 1; k <= 34; k++) {
                    System.out.print("*");
                }
                System.out.println();

                System.out.print("Which seat would you like to book?");
                Seats = input.nextInt();

                while (Seats < 0 || Seats > 29) {
                    System.out.println("Only 0 - 29 seats allowed to book. Try again!");
                    Seats = input.nextInt();
                }

                for (int SeatCounter = 0; SeatCounter < SeatNo.length; SeatCounter++) {
                    if (SeatCounter == Seats) {
                        System.out.println("Seat" + Seats + " is booked.");
                        System.out.println("Thanks for booking\n\nWould you like to book again?");
                        Choice = input.nextInt();

                        if (Choice == 2) {
                            System.out.println("Thank you visit again.");
                    }
                }   
            }

            while (Choice !=1 && Choice !=2) {
                System.out.println("Invalid input.");
                System.out.println("1.Continue booking; 2.Exit");
                Choice = input.nextInt();

                if (Choice == 2) {
                    System.out.println("Thank you visit again.");
                }  
            }
        }
    }
}