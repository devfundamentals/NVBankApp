package bank;

public class User {
    private String name;
    private String account;


    public  User(String name,String account){
        setName(name);
        setAccount(account);

    }
    public void setName(String name){
        this.name = name;
    }
    public void setAccount(String account){
        this.account = account;
    }
    public String getName(){
        return  name;
    }
    public String getAccount(){
        return  account;
    }

}


