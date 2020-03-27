package bank;

public class Bank {
    private User user;
    public Bank(User user){
        this.user= user;
    }
    public void welcome(){
        System.out.println("Welcome " + user.getName());
    }
    public void currentAccount(){
        System.out.println("Your current account is " + user.getAccount());
    }
}

