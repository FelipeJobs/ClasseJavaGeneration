package ProjetoCaixaEletronico;
public class UsandoclassBanco {
    public static void main(String[] args) {
        ContaBanco c1 = new ContaBanco();
        c1.setDono("Felipe Pereira dos Santos");
        c1.setNumConta(1111111111);
        c1.abrirConta("cc");
        c1.deposito(300);
        c1.pagamentoMensal();
        c1.sacar(338);
        c1.fecharConta();
        c1.estadoAtual();
    }
}
