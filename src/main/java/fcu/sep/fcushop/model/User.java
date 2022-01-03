package fcu.sep.fcushop.model;

public class User {

    private String Username;
    private String Name;
    private String Password;
    private String Email;
    private String Phone;

    public User(){

    }

    public User(String Username, String Name, String Password, String Email, String Phone) {
        this.Username = Username;
        this.Name = Name;
        this.Password = Password;
        this.Email = Email;
        this.Phone = Phone;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Name = Name;
    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = Name;
    }


    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }



}
