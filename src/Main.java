public class Main {
    public static void main(String[] args) {

        int costMile = 20; // стоимость одной мили в рублях

        int ticketPrice = 13730; // стоимость билета

        int bonus = ticketPrice / costMile; //количество начисленных бонусных миль


        System.out.println(" Вам начислено " + bonus + " бонусных(е) миль(и).");
    }
}
