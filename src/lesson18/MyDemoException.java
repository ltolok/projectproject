package lesson18;

public class MyDemoException {
    public static void main(String[] args) {
        chekLogin("qwtryuееttro", "qwerrty", "qwerty");
        chekLogin("qwtryuееttrotytytytytytytyt", "qwerty", "qwerty");
    }

    public static void chekLogin(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException("Неправильный логин");
            }
            if (password.length() >= 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Неправильный пароль");
            }
        } catch (WrongLoginException | WrongPasswordException е) {
            System.out.println(е.getMessage());
        } finally {
            System.out.println(login + "  " + password + "  " + confirmPassword);
        }
    }
}
