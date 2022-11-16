public class Customer extends User {

    private String customerName;
    private String adress;
    private Float accountBalance;


    @Override
    public void login(){
        super.login();
        setLoginStatusCustomer (true);
    }

}
