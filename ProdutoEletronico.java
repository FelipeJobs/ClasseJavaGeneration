/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto no console.
 */
package PooExercícosGeneration;
public class ProdutoEletronico {
    private String nome;
    private String marca;
    private boolean estoque;
    // métodos
    void disponivel(){
        if(getEstoque() == true){
            System.out.println("Temos o produto em estoque");
        }
        else {
            System.out.println("Produto indisponível");}

    }
    void status (){
        System.out.println(getMarca());
        System.out.println(getNome());
        System.out.println("Temos esse produto em estoque? " + getEstoque());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean getEstoque() {
        return estoque;
    }

    public void setEstoque(boolean estoque) {
        this.estoque = estoque;
    }
}
