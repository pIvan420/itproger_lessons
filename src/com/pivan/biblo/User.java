package com.pivan.biblo;

public class User {
    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public static class Query{
        public static void printToLog(String login, String password){
            System.out.println("Пользователь \"" + login + "\" с паролем \"" + password + "\" отправил запрос.");
        }
    }

    public void createQuery(){
        Query.printToLog(this.login, this.password);
    }

}
