package command_b15.clase;

public class Ocupare implements Command{
    private Masa masa;

    public Ocupare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.ocupaMasa();
    }
}
