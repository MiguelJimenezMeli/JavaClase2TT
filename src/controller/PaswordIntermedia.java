package controller;

public class PaswordIntermedia extends Password
{
    public PaswordIntermedia() {
        super("^(?=\\w*\\d)(?=\\w*[a-z])\\S{8,15}$");
    }
}
