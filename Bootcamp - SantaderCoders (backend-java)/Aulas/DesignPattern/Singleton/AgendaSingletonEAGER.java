package Aulas.DesignPattern.Singleton;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonEAGER {

    private static final AgendaSingletonEAGER INSTANCE = new AgendaSingletonEAGER();

    private Map<String, Boolean> diaDaSemanaDisponivel = new HashMap<>();

    public AgendaSingletonEAGER() {

        diaDaSemanaDisponivel.put("Domingo", true);
        diaDaSemanaDisponivel.put("Segunda", true);
        diaDaSemanaDisponivel.put("Terça", true);
        diaDaSemanaDisponivel.put("Quarta", true);
        diaDaSemanaDisponivel.put("Quinta", true);
        diaDaSemanaDisponivel.put("Sexta", true);
        diaDaSemanaDisponivel.put("Sábado", true);
    }
    
    public static AgendaSingletonEAGER getInstance() {
        return  INSTANCE;
    }

    public Map<String, Boolean> getDiaDaSemanaDisponivel(){
        return diaDaSemanaDisponivel;
    }

    public void ocupa(String dia){
        if (diaDaSemanaDisponivel.get(dia) != null && diaDaSemanaDisponivel.get(dia) == Boolean.TRUE) {
            diaDaSemanaDisponivel.replace(dia, Boolean.FALSE);
        } else {
            diaDaSemanaDisponivel.replace(dia, Boolean.TRUE);
        }
    }
}
