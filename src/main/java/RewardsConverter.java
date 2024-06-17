import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

class RewardValue{
    double cashValue;
    double milesValue;
    double CASH_TO_MILES_RATE=0.0035;

public RewardValue(double cashValue){
    milesValue=conversion(cashValue);
}

public double conversion(double cash){
    return cash/CASH_TO_MILES_RATE;
}

public double getCashValue(){
    return cashValue;
}

public double getMilesValue(){
    return milesValue;
}
}