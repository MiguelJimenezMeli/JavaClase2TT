package controller;

public class PaswordFuerte extends Password
{
    public PaswordFuerte() {
        super("^(?=\\w*\\d)(?=\\w*[A-Z])(?=\\w*[a-z])\\S{8,15}$");
    }
}
