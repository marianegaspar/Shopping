public class Vestuario extends Loja{

    //atributos
    public boolean produtosImportados;

    //construtor para inicializar todos os atributos
    public Vestuario(String n, int q, double s, Endereco e,Data d,int quantProdutos, boolean produtosImportados){
        super(n,q,s,e,d,q);//chamando o cosntrutor da superclasse
        this.produtosImportados=produtosImportados;
    }

    //métodos de acesso
    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados=produtosImportados;
    }

    @Override
   public String toString(){
    return super.toString() + "Produto importado: " + produtosImportados;
    
   }

    
}
