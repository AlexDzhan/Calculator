import java.util.Scanner;
class Calculate {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        String anotherOption = "y", operatorOpt = "a";
        int no1 = 0, no2 = 0;
        double result = 0;
        System.out.println("Welcome to the online calculator! Let begin...");
        while (anotherOption.equalsIgnoreCase("y")) {
            System.out.println("Please enter your 1st number: ");
            no1 = input.nextInt();
            System.out.println("Please confirm your operator:\n1 = +\n2 = - \n3 = *\n4 = /");
            operatorOpt = input.next();
            System.out.println("Please enter your 2nd number: ");
            no2 = input.nextInt();

            switch (operatorOpt) {
                case "+":
                    result = no1 + no2;
                    break;
                case "-":
                    result = no1 - no2;
                    break;
                case "*":
                    result = no1 * no2;
                    break;
                case "/":
                    result = no1 / no2;
                    break;
                default:
                    result = 0;
                    break;
            }
            System.out.println("Your total calculation is: "+result);
            System.out.println("Would you like to do another sum? y/n ");
            anotherOption=input.next();
        }
    }
}

