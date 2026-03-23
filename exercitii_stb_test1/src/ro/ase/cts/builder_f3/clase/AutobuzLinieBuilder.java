package ro.ase.cts.builder_f3.clase;

public class AutobuzLinieBuilder implements AbstractBuilder{
    private  String numeSofer;
    private  String modelAutobuz;
    private  boolean opririCapatLinie;
    private  boolean deschideUsiAutomat;
    private  boolean textEcranDerulator;

    public AutobuzLinieBuilder() {
        opririCapatLinie=false;
        deschideUsiAutomat=false;
        textEcranDerulator=false;
    }

    @Override
    public AutobuzLinie build(String numeSofer, String modelAutobuz) {
        return new AutobuzLinie(numeSofer,modelAutobuz,opririCapatLinie,deschideUsiAutomat,textEcranDerulator);
    }

    @Override
    public AbstractBuilder setOpririCapatLinie(boolean opririCapatLinie) {
        this.opririCapatLinie=opririCapatLinie;
        return this;
    }

    @Override
    public AbstractBuilder setDeschideUsiAutomat(boolean deschideUsiAutomat) {
       this.deschideUsiAutomat=deschideUsiAutomat;
       return this;
    }

    @Override
    public AbstractBuilder setTextEcranDerulator(boolean textEcranDerulator) {
        this.textEcranDerulator=textEcranDerulator;
        return this;
    }
}
