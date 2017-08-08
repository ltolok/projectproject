package lesson15;

public class NewUser {
    private String login = "Asdfg";
    private String password = "1q2w3e";

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь: login  " + login + "  password " + password + "   отправил запрос");
            }
        }
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        NewUser user = new NewUser();
        user.createQuery();
    }
}
