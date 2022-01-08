package fcu.sep.fcushop.model;

public class User {
  private int ID;

  private String USERNAME;

  private String PASSWORD;

  private String EMAIL;

  private String PHONE;

  public int getId() {
    return ID;
  }
  public void setId(int id) {
    this.ID = id;
  }

  public String getUsername() {
    return USERNAME;
  }
  public void setUsername(String username) {
    this.USERNAME = username;
  }

  public String getPassword() {
    return PASSWORD;
  }
  public void setPassword(String password) {
    this.PASSWORD = password;
  }

  public String getEmail() {
    return EMAIL;
  }
  public void setEmail(String email) {
    this.EMAIL = email;
  }

  public String getPhone() {
    return PHONE;
  }
  public void setPHONE(String phone) {
    this.PHONE = phone;
  }
}