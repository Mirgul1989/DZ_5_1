public class Boss {
    private int zdorovie;
    private int uron;
    private String tipZashity;

    public Boss(int zdorovie, int uron, String tipZashity) {
        this.zdorovie = zdorovie;
        this.uron = uron;
        this.tipZashity = tipZashity;
    }


    public int getZdorovie() {
        return zdorovie;
    }

    public void setZdorovie(int zdorovie) {
        this.zdorovie = zdorovie;
    }

    public int getUron() {
        return uron;
    }

    public void setUron(int uron) {
        this.uron = uron;
    }

    public String getTipZashity() {
        return tipZashity;
    }

    public void setTipZashity(String tipZashity) {
        this.tipZashity = tipZashity;
    }
}