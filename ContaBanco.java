package ProjetoCaixaEletronico;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    public void estadoAtual(){
        System.out.println("======================================================");
        System.out.println("O dono da conta é: " + getDono());
        System.out.println("O número da conta é: " + getNumConta());
        System.out.println("O tipo de conta é: " + getTipo());
        System.out.println("O saldo da sua conta atualmente é: " + getSaldo());
        System.out.println("A sua conta está " + getStatus());
        System.out.println("======================================================");
    }
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }// criação das funções que serão utilizadas.
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC" || t == "cc"){
            setSaldo(50);}
        if (t == "CP" || t == "cp"){
            setSaldo(150);}
    }
    public void fecharConta(){

        if (this.getSaldo() > 0) {
            System.out.println("Voce tem saldo na conta, por isso não pode fechá-la.");
        }
        else if(getSaldo() <0){
            System.out.println("Você tem saldo negativo, normalize para fechar a conta");
        }
        else{
            System.out.println("A sua conta foi fechada.");
            this.setStatus(false);
        }
    }
    protected void sacar(double ret){
        if(getStatus() && getSaldo() >= ret){
            this.setSaldo(this.getSaldo()-ret);
        System.out.println("O saque foi realizado com sucesso na conta de: " + getDono());}
        else if(getStatus() && getSaldo() < ret){
            System.out.println("Você não tem saldo suficiente para essa retirada");
        }
        else{
            System.out.println("Não localizamos essa conta no nosso banco de dados.");
        }
    }
    protected void deposito(double d){// quando deixo o getstatus como vazio ele considera como VDD.
        if(getStatus()){
           this.setSaldo(this.getSaldo()+ d);
        System.out.println("O deposito foi realizado com sucesso na conta de: " + getDono());}
       else{
           System.out.println("Não localizamos essa conta no nosso banco de dados.");
       }
    }
    protected void pagamentoMensal(){
        if(getStatus() && getTipo() == "CC" || getStatus() && getTipo() == "cc"){
            this.setSaldo(this.getSaldo()-12);
        }
        else if(getStatus() && getTipo() == "CP"||getStatus() && getTipo() == "cp"){
            this.setSaldo(this.getSaldo()-20);}
    }
 // criação dos métodos especiais.
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double s) {
        this.saldo = s;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
