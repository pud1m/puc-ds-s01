package src.model;

public class User{
    public User(String Name, String Password, String Address){
        setName(Name);
        setPassword(Password);
        setAddress(Address);
    }

    private String Name;
    private String Password;
    private String Address;
    

    public void setName(String Name){
        this.Name = Name;
    }

    public String getName(){
        return Name;
    }

    public void setPassword(String Password){
        this.Password = Password;
    }

    public String getPassword(){
        return Password;
    }

    public void setAddress(String Address){
        this.Address = Address;
    }

    public String getAddress(){
        return Address;
    }
}