package proxy_f8.main;

import proxy_f8.clase.Autobuz;
import proxy_f8.proxy.IAutobuz;
import proxy_f8.proxy.ProxyAutobuzNoapte;

public class Main {
    public static void main(String[] args) {
        IAutobuz autobuz=new Autobuz("B100AAA",0);
        autobuz.opresteInStatie();

        System.out.println("---------");
        IAutobuz proxy=new ProxyAutobuzNoapte(autobuz);
        proxy.opresteInStatie();
        IAutobuz proxy2=new ProxyAutobuzNoapte(new Autobuz("DB87BBB",8));
        proxy2.opresteInStatie();

    }
}
