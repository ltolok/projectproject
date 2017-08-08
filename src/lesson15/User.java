package lesson15;

public class User {
    private String login = "Asdfg";
    private String password = "1q2w3e";

    public class Query {
        public void printToLog() {
            System.out.println("Пользователь: login  " + login + "  password " + password + "   отправил запрос");
        }
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User();
        user.createQuery();
        Query query1 = user.new Query();
        query1.printToLog();
        Query query2 = new User().new Query();
        query2.printToLog();
    }
}
