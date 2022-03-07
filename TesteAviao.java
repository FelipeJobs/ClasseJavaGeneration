package PooExercícosGeneration;

public class TesteAviao {
    public static void main(String[] args) {
        Avião av1 = new Avião();
        Avião av2 = new Avião();
        av1.setAssentosocupados(100);
        av1.setCompaniaAerea("Tam");
        av1.setAutorizacao(true);
        av1.status();
        System.out.print("----------------------------------------------------\n");
        av2.setAssentosocupados(150);
        av2.setCompaniaAerea("Gol");
        av2.setAutorizacao(false);
        av2.status();
    }
}
