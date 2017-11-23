package edu.camt.se444.AdventureGame.model;

public class User {
    private int id;
    private String user;
    private String password;
    private String firstname;
    private String lastname;
    private String email;
    
    
    public User (int id, String user , String password, String firstname, String lastname , String email){
        super();
        this.id = id;
        this.user = user;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public User(){
        super();
        this.id = 0;
        this.user = "";
        this.password = "";
        this.firstname = "";
        this.lastname = "";
        this.email = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lasttname) {
        this.lastname = lasttname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
