package ro.ase.cts.builder_f3.main;

import ro.ase.cts.builder_f3.clase.AbstractBuilder;
import ro.ase.cts.builder_f3.clase.AutobuzLinie;
import ro.ase.cts.builder_f3.clase.AutobuzLinieBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new AutobuzLinieBuilder();
        builder.setDeschideUsiAutomat(true);
        AutobuzLinie a1=builder.build("Sfetcu Andreea","aaaaa");
        AutobuzLinie a2=builder.setOpririCapatLinie(true).build("Sfetcu Denis","bbbbb");
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }
}
