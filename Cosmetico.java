public class Cosmetico extends Loja{

    //atributos
    protected double taxaComercializacao;

    //construtor para inicializar todos os atributos
    public Cosmetico(String n, int q, double s, Endereco e,Data d, int quantProdutos,double taxaComercializacao){
        super(n, q, s, e, d, q);//chamando o construtor da superclasse
        this.taxaComercializacao=taxaComercializacao;
    }
    
    //métodos de acesso
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao=taxaComercializacao;
    }


   @Override
   public String toString(){
    return "Loja de Cosméticos - Taxa de comercialização: " + taxaComercializacao + 
    super.toString();
   }
    

}
