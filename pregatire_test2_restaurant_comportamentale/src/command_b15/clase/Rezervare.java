package command_b15.clase;

public class Rezervare implements Command{
    private Masa masa;

    public Rezervare(Masa masa) {
        this.masa = masa;
    }

    @Override
    public void executa() {
        masa.rezervaMasa();
    }
}
