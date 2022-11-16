import java.util.Scanner;

public class Main {
    static User user;
    static Store store = new Store();
    public static void main(String[] args) {
        String userInput;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, are you: 1. A Customer or 2. An Admin?");
        int userSelection = scanner.nextInt();
        createUser(userSelection);
        user.createAccount();
        user.login();
        showMenu(user);


    }

    private static void showMenu(User user) {
        if (user.isLoginStatusAdmin()){
            System.out.println("Welcome Admin");
            System.out.println("Here's the stores stock");
            store.showStock();
        }
        else if (user.isLoginStatusCustomer()){
            customerMenu();

        }
    }



    public static void createUser(int selection){
        do {
            switch (selection) {
                case 1:
                    user = new Customer();
                    break;
                case 2:
                    user = new Administrator();
                    break;
                default:
                    System.out.println("Wrong input");



            }
        }while (selection > 3);

    }

    public static void customerMenu() {
        int customerChoice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer menu");
        System.out.println("What would you like to do?");
        System.out.println("1. View products");
        System.out.println("2. Log out");

        customerChoice = sc.nextInt();


        switch(customerChoice)
        {
            case 1:
                store.showStock();
                customerPurchase();
                break;
            case 2:
                break;
            default:
                customerMenu();

        }

    }
    public static void customerPurchase(){
        String input = "";
        System.out.println("Do you want to buy a Lamp or a Clock?");
        Scanner scanner2 = new Scanner(System.in);
        input = scanner2.nextLine();
        if (input.equals("Lamp")){
            System.out.println("You have purchased a Lamp for 100 sek.");
        } else if (input.equals("Clock")) {
            System.out.println("You have purchased a Clock for 150 sek.");
        }else {
            System.out.println("Wrong input");
            customerPurchase();
        }


    }



}
