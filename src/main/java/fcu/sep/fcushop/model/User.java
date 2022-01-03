package fcu.sep.fcushop.model;

public class User {

  private String Username;

  private String Name;

  private String Password;

  private String Mail;

  private String Phone;

  public User() {
  }

  public User(String Username, String Name, String Password, String Mail, String Phone) {
    this.Username = Username;
    this.Name = Name;
    this.Password = Password;
    this.Mail = Mail;
    this.Phone = Phone;
  }

  public String getUsername() {
    return Username;
  }

  public void setUsername(String Username) {
    this.Username = Username;
  }

  public String getName() {
    return Name;
  }

  public void setName(String Name) {
    this.Name = Name;
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String Password) {
    this.Password = Password;
  }

  public String getMail() {
    return Mail;
  }

  public void setMail(String Mail) {
    this.Mail = Mail;
  }

  public String getPhone() {
    return Phone;
  }

  public void setPhone(String Phone) {
    this.Phone = Phone;
  }
}