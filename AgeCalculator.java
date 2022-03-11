import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;


public class AgeCalculator {
    
    public static void main(String [] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Date of Birth(DD/MM/YYYY): ");
        System.out.println("Date: ");
        int birthDate = input.nextInt();
        System.out.println("Month: ");
        int birthMon = input.nextInt();
        System.out.println("Year: ");
        int birthYear = input.nextInt();
        
        
        System.out.println("Age at date of (DD/MM/YYYY): ");
        System.out.println("Date: ");
        int currDate = input.nextInt();
        System.out.println("Month: ");
        int currMon = input.nextInt();
        System.out.println("Year: ");
        int currYear = input.nextInt();
        
        LocalDate date = LocalDate.now();
        LocalDate birth = LocalDate.of(birthYear, birthMon, birthDate);
        LocalDate curr = LocalDate.of(currYear, currMon, currDate);
        
        int years = Period.between(birth,curr).getYears();
        int months = Period.between(birth,curr).getMonths();
        int days = Period.between(birth,curr).getDays();
        System.out.println("Age: ");
        System.out.println(years+"Years\t"+months+"Months\t"+days+"Days");
    }
} 