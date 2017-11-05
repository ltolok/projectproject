package lesson12.task1;

public class SeasonsDemo {
    public static void main(String[] args) {
        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            System.out.print(s);
            System.out.println("  " + s.getTemperature());
            System.out.println("  " + s.getDescription());
        }
        Seasons favoritSeason = Seasons.SPRING;
        System.out.println("Переменная Seasons содержит     " + Seasons.SPRING);
        printFavoritSeason(favoritSeason);
    }

    static void printFavoritSeason(Seasons seasons) {
        switch (seasons) {
            case WINTER: {
                System.out.println("Мое любимое время года зима");

                break;
            }
            case SPRING: {
                System.out.println("Мое любимое время года весна");
                break;
            }
            case SUMMER: {
                System.out.println("Мое любимое время года лето");
                break;
            }
            case AUTUMN: {
                System.out.println("Мое любимое время года осень");
                break;
            }
        }
    }
}


