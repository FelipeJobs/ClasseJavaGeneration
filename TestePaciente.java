package PooExercícosGeneration;

public class TestePaciente {
    public static void main(String[] args) {
        Paciente pa = new Paciente();
        Paciente pa1 = new Paciente();
        pa.setNome("Felipe");
        pa.setCpf(111111111);
        pa.setDiagnostico(true);
        pa.status();
        System.out.print("----------------------------------------------------\n");
        pa1.setNome("Maria");
        pa1.setCpf(111111111);
        pa1.setDiagnostico(false);
        pa1.status();
    }
}
