public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(1000);
        System.out.println(miles);

        int miles1 = service.calculate(1);
        System.out.println(miles1);
    }
}