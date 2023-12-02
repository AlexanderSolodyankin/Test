package whatsapp;

import java.util.Scanner;

public class WhatsAppApplication {

    User user;
    Scanner input;

    public void start(){
        this.user = new User();
        this.input = new Scanner(System.in);
        System.out.println("Начало работы васапа");

        System.out.println("Введите свой логин");
        String login = input.nextLine();
        System.out.println("Введите пароль");
        String password = input.nextLine();
        System.out.println("Введите свой номер телефона");
        String phone = input.nextLine();
        user.setParameters(login,password,phone);

        getUserAuth();


        System.out.println("Конец работы Васапа");
    }


    public void getUserAuth(){
        user.printAllParamenter();
//        System.out.println("Логин пользователя: " + user.login);
//        System.out.println("Пароль пользователя: " + user.password);
//        System.out.println("Номер телефона пользователя: " + user.phone);
    }
}
