public class Main {
    public static void main(String[] args) {
    createHeroes();
        for (Hero hero1:createHeroes()) {
            System.out.println("Informasiya o geroiah:"+" "+ hero1.getZdorovie()+" "+ hero1.getSupersposobnost()+" "+ hero1.getUron());


        }
        Boss boss = new Boss(500, 600, "Kinetik");
        System.out.println("Zdorovie Bossa:" + "" + boss.getZdorovie() + "" + "Uron Bocca:" + "" + boss.getUron() + "" + "Tip zashity Bossa:" + "" +
                boss.getTipZashity());

    }
    public static Hero[] createHeroes() {

        Hero hero1 = new Hero(300, "Kinetik", 250);
        Hero hero2 = new Hero(400, "Magical", 350);
        Hero hero3 = new Hero(200, "Fhysical", 150);
        Hero[] massivHeros = {hero1, hero2, hero3};
        return massivHeros;
    }


}


