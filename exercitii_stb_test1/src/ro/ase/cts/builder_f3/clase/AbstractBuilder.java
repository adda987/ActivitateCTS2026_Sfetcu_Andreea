package ro.ase.cts.builder_f3.clase;

public interface AbstractBuilder {
    AutobuzLinie build(String numeSofer, String modelAutobuz);
    AbstractBuilder setOpririCapatLinie(boolean opririCapatLinie);
    AbstractBuilder setDeschideUsiAutomat(boolean deschideUsiAutomat);
    AbstractBuilder setTextEcranDerulator(boolean textEcranDerulator);
}
