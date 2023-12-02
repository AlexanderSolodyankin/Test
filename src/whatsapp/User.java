package whatsapp;

public class User {
    String login;
    String password;
    String phone;

    public void setParameters(String login, String password, String phone){
        this.login = login;
        this.password = password;
        this.phone = phone;

    }

    public void printAllParamenter(){
        System.out.println("Логин пользователя: " + login);
        System.out.println("Пароль пользователя: " + password);
        System.out.println("Номер телефона пользователя: " + phone);
    }
}
