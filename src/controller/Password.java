package controller;

import java.util.regex.Pattern;

public class Password {

    private String regex;
    private String value;

    public Password(String regex) { setRegex(regex); }

    public String getRegex() { return regex; }

    public void setRegex(String regex) { this.regex = regex; }

    public boolean checkPass(String pass) { return  Pattern.matches(regex, pass); }

    public void setValue(String pwd) throws Exception {
        if (!checkPass(pwd)){ throw new Exception("La contraseña no cumple con lo requerido");}
        this.value = pwd;
    }
}
