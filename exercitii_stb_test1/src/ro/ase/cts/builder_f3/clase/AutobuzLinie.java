package ro.ase.cts.builder_f3.clase;

public class AutobuzLinie {
    private final String numeSofer;
    private final String modelAutobuz;
    private final boolean opririCapatLinie;
    private final boolean deschideUsiAutomat;
    private final boolean textEcranDerulator;


    public AutobuzLinie(String numeSofer, String modelAutobuz, boolean opririCapatLinie, boolean deschideUsiAutomat, boolean textEcranDerulator) {
        this.numeSofer = numeSofer;
        this.modelAutobuz = modelAutobuz;
        this.opririCapatLinie = opririCapatLinie;
        this.deschideUsiAutomat = deschideUsiAutomat;
        this.textEcranDerulator = textEcranDerulator;
    }

    public AutobuzLinie() {
        modelAutobuz="";
        numeSofer="";
        opririCapatLinie=false;
        deschideUsiAutomat=false;
        textEcranDerulator=false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", modelAutobuz='").append(modelAutobuz).append('\'');
        sb.append(", opririCapatLinie=").append(opririCapatLinie);
        sb.append(", deschideUsiAutomat=").append(deschideUsiAutomat);
        sb.append(", textEcranDerulator=").append(textEcranDerulator);
        sb.append('}');
        return sb.toString();
    }
}
