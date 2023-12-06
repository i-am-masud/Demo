package bank;

Class Accout {
    public String name;
/*default*/String name;  <default>
    protected String email;
    private String password;

    //getters and setters

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name= " Khandekar Md Masud " ;
        account1.email= " mdmasud170199@gmail.com " ;
        account1.password= "1234";
        System.out.println(account1.getPassword());
    }
}