package app08a;

import com.opensymphony.xwork2.ActionSupport;

public class VisitorTestAction extends ActionSupport {
    private String userName;
    private String password;
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
