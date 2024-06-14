package Aulas.DesignPattern.Singleton;

public class Agenda {
    public static void main(String[] args) {
        //Sem Singleton
        reservarDia("Segunda");
        reservarDia("Quinta");

        //Com Singleton - EAGER
        reservarDiaEAGER("Terça");
        reservarDiaEAGER("Sábado");

        //Com Singleton - LAZY
        reservarDiaLazy("Quarta");
        reservarDiaLazy("Sexta");
    }

    //Sem Singleton
    public static void reservarDia(String dia) {
        DiasSemana agenda = new DiasSemana();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiaDaSemanaDisponivel());
    }

    //Com Singleton - EAGER
    public static void reservarDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiaDaSemanaDisponivel());
    }

    //Com Singleton - LAZY
    public static void reservarDiaLazy(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDiaDaSemanaDisponivel());
    }
}
