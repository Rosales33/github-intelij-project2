package services;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsService {
    private static KieSession ksession;

    public static KieSession getInstance() { //esto igual para una ksession
        if (ksession == null) {
            KieServices ks = KieServices.Factory.get();
            KieContainer kc = ks.getKieClasspathContainer();
            ksession = kc.newKieSession("pneumoniaKS");
        }
        return ksession;
    }
}

