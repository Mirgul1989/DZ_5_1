public class Hero {

    private int zdorovie;
    private int uron;
    private String supersposobnost;

    public int getUron() {
        return uron;
    }

    public int getZdorovie() {
        return zdorovie;
    }

    public String getSupersposobnost() {
        return supersposobnost;
    }

    public Hero(int zdorovie, int uron) {//Конструктор 1
        this.zdorovie = zdorovie;
        this.uron = uron;


    }

    public Hero(int zdorovie, String supersposobnost, int uron) {//Конструктор 2

        this.zdorovie = zdorovie;
        this.supersposobnost = supersposobnost;
        this.uron = uron;
    }}

