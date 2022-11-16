import java.util.Scanner;

public abstract class User {

    private String password;
    private String email;

    public boolean isLoginStatusAdmin() {
        return loginStatusAdmin;
    }

    public boolean isLoginStatusCustomer() {
        return loginStatusCustomer;
    }

    private boolean loginStatusAdmin;
    private boolean loginStatusCustomer;

    public void setLoginStatusAdmin(boolean loginStatusAdmin) {
        this.loginStatusAdmin = loginStatusAdmin;
    }

    public void setLoginStatusCustomer(boolean loginStatusCustomer) {
        this.loginStatusCustomer = loginStatusCustomer;
    }



    public void login()
    {
        if (password == null || email == null){
            System.out.println("You don't have an account");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email: ");
        String inputEmail = scanner.nextLine();
        System.out.println("Enter your password: ");
        String inputPassword = scanner.nextLine();
        while ((!inputEmail.equals(email) || !inputPassword.equals(password)))
        {
            System.out.println("Incorrect email or password");
            System.out.println("Press enter to try again");
            inputPassword = scanner.nextLine();
            System.out.println("Enter your email: ");
            inputEmail = scanner.nextLine();
            System.out.println("Enter your password: ");
            inputPassword = scanner.nextLine();

        }


    }

    public void createAccount(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an email for your account: ");
        String inputEmail = scanner.nextLine();
        this.email = inputEmail;
        System.out.println("Create a password for your account: ");
        String inputPassword = scanner.nextLine();
        this.password = inputPassword;

    }

}
