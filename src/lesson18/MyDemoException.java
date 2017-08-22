package lesson18;

public class MyDemoException {
    public static void main(String[] args) {
        cheklogin("qwtryuririrroroororroro", "qwerty", "qwerty");
    }

    static void cheklogin(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20) {
                throw new WrongLoginException();
            }
        } catch (WrongLoginException e) {
            System.out.println("Неправильно введен login.");
        } finally {
            System.out.println(login+"  " + password +"  "+confirmPassword);
        }
    }
}
