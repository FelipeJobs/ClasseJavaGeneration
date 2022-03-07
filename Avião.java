/*Crie uma classe avião e apresente os atributos e métodos referentes esta
classe, em seguida crie um objeto avião, defina as instancias deste objeto e
 apresente as informações deste objeto no console.*/
package PooExercícosGeneration;

public class Avião {
    // atributos
    public boolean autorizacao;
    private double assentosocupados;
    public String companiaAerea;
    void decolar(){
        if(getAutorizacao() == true){
            System.out.println("Você pode decolar");
        }
        else{
            System.out.println("Aguarde a autorização para decolar");
        }
    }
    void status(){
        System.out.println("A compania área é: " + getCompaniaAerea());
        System.out.println("O número de assentos ocupados é: "+getAssentosocupados());
        decolar();
    }

    public boolean getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(boolean autorizacao) {
        this.autorizacao = autorizacao;
    }

    public double getAssentosocupados() {
        return assentosocupados;
    }

    public void setAssentosocupados(double assentosocupados) {
        this.assentosocupados = assentosocupados;
    }

    public String getCompaniaAerea() {
        return companiaAerea;
    }

    public void setCompaniaAerea(String companiaAerea) {
        this.companiaAerea = companiaAerea;
    }
}
