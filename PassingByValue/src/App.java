public class App {
    public static void main(String[] args) {

        App app = new App();
        int value = 5 ;
        System.out.println("1. VALUE " + value);
        App.show(value);
        System.out.println("4.VALUE : " + value);
    }

    private static void show(int value) {

        System.out.println("2. VALUE " + value);
        value = 8;
        System.out.println("3.VALUE : " + value);

    }
}
