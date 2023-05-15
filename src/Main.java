public class Main {
    public static void main(String[] args) {
        
        int price = 5000; // стоимость билета
        int mile = 20; // количество рублей для для одной бонусной мили
        int amount; // количество бонусных миль
        amount = price / mile;

        System.out.println(amount); //вывод на экран

    }
}