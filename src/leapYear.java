import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = Scanner.nextInt();
        boolean isLeapyear = false;
        boolean isDivisionBy4 = year % 4 ==0;
        if (isDivisionBy4) {
            boolean isDivisionBy100 = year % 100 ==0;
            if (isDivisionBy100){
                boolean isDivisionBy400 = year % 400 ==0;
                if (isDivisionBy400) {
                    isLeapyear = true;
                }
            } else {
                isLeapyear = true;
            }
        }
        if (isLeapyear) {
            System.out.printf("The year %d is leap year",year);
        } else {
            System.out.printf("The year %d is not a leap year",year);
        }
    }
}
