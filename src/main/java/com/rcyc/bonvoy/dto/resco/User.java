package com.rcyc.bonvoy.dto.resco;

import javax.xml.bind.annotation.XmlElement;

public class User {
    private String Login;

    private String Password;

    private String SessionId;

    @XmlElement(name = "Login")
    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    @XmlElement(name = "Password")
    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    @XmlElement(name = "SessionId")
    public String getSessionId() {
        return SessionId;
    }

    public void setSessionId(String sessionId) {
        SessionId = sessionId;
    }

    /**
     * @param login
     * @param password
     */
    public User(String login, String password) {
        super();
        Login = login;
        Password = password;
    }

    /**
     * @param sessionid
     * @param password
     */
    public User(String sessionid) {
        super();
        SessionId = sessionid;
    }


    /**
     *
     */
    public User() {
    }

    @Override
    public String toString() {
        return "ClassPojo [Login = " + Login + ", Password = " + Password + "]";
    }
}

