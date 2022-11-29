package src.model;

import src.model.Account;

public class Admin extends Account {

    private String password;

    public Admin(int id, String nickname) {
        super(id, nickname);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
