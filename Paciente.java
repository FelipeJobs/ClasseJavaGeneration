/* Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste objeto
e apresente as informações deste objeto no console.*/
package PooExercícosGeneration;
public class Paciente {
    // atributos
    private String nome;
    private double cpf;
    private boolean diagnostico;
    private int idade;

    // metodos
    void diagnosticar(){
        if(getDiagnostico() == true){
            System.out.println("Você está saudável");
        }
        else {
            System.out.println("Você Precisa voltar no médico para uma nova avaliação.");
        }}
    void status(){
        System.out.println("O nome da pesssoa é: " + getNome());
        System.out.println("Seu CPF é: " + getCpf());
        diagnosticar();
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public boolean getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(boolean diagnostico) {
        this.diagnostico = diagnostico;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
