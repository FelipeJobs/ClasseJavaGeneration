package PooExercícosGeneration;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private double Cpf;
    private String endereco;
    private double numeroDaCasa;
    private double pagar;
    int c;
    double valores[]={15,7.5,2.5,3,2,0};
    Scanner input=new Scanner(System.in);
   public void perguntas(){
       System.out.print("Qual seu nome: ");
       setNome(input.nextLine());
       System.out.print("Qual seu seu endereço e o número da casa: ");
       setEndereco(input.nextLine());
       System.out.print("Qual seu CPF: ");
       setCpf(input.nextDouble());
       System.out.println();
   } // funções
    public void produtos(){
        System.out.println("0= Arrroz    R$15\n" + "1 = Feijão   R$ 7.5\n" + "2= Macarrão  R$ 2.5\n"+ "3 = Leite    R$ 3\n" +
                "4 = Bolacha  R$ 2\n" + "5 = Finalizar Compra\n");
    }
    public void comprar(){
        while(true){
            System.out.println("Qual produto você deseja comprar");
            produtos();
            System.out.print("Escolha: ");
            c = input.nextInt();
            if(c == 5){
                break;}
            setPagar(getPagar() + valores[c]);
        }
   }
   void resultado(){
       System.out.println("\33[35mO valor total da sua compra foi R$: " + getPagar());
       System.out.println("\33[36mA sua compra será entregue no endereço: "+ getEndereco());
   }
   // serviços
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCpf() {
        return Cpf;
    }

    public void setCpf(double cpf) {
        Cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    public double getPagar() {
        return pagar;
    }

    public void setPagar(double pagar) {
        this.pagar = pagar;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double[] getValores() {
        return valores;
    }

    public void setValores(double[] valores) {
        this.valores = valores;
    }
}

