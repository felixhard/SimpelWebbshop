import java.util.Scanner;

public class Administrator extends User {

    private String adminName;


    @Override
    public void login()
    {
       super.login();
       setLoginStatusAdmin(true);

    }

}
