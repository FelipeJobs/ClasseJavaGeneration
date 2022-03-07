package PooExercícosGeneration;

public class TesteProdutoElettronico {
    public static void main(String[] args) {
        ProdutoEletronico p1 = new ProdutoEletronico();
        ProdutoEletronico p2 = new ProdutoEletronico();
        p1.setNome("TV");
        p1.setMarca("Toshiba");
        p1.setEstoque(true);
        p1.status();
        System.out.print("----------------------------------------------------\n");
        p2.setNome("Celular");
        p2.setMarca("LG");
        p2.setEstoque(false);
        p2.status();





    }
}
