package lesson15;

public class User1 {
    private static String login = "Asdfg";
    private static String password = "1q2w3e";

    static class Query {
        public void printToLog() {
            System.out.println("Пользователь: login  " + login + "  password " + password + "   отправил запрос");
        }
    }

    public void createQuery() {
        User1.Query query = new User1.Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User1 user1 = new User1();
        user1.createQuery();
        User1.Query query1 = new User1.Query();
        query1.printToLog();
    }
}
