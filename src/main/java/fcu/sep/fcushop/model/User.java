package fcu.sep.fcushop.model;

public class User {

  private String uid;

  private String name;

  private String password;

  public User() {
  }

  public User(String uid, String name, String password) {
    this.uid = uid;
    this.name = name;
    this.password = password;
  }

  public String getId() {
    return uid;
  }

  public void setId(String uid) {
    this.uid = uid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
