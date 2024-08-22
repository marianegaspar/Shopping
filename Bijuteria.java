public class Bijuteria extends Loja{

    //atributos
    protected double metaVendas;

    //construtor para inicializar todos os atributos
    public Bijuteria(String n, int q, double s, Endereco e,Data d,int quantProdutos, double metaVendas){
        super(n, q, s, e, d,q);//chamando o construtor da superclasse
        this.metaVendas=metaVendas;
    }

    //métodos de acesso
    public double getMetaVendas(){
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas=metaVendas;
    }

    @Override
   public String toString(){
    return super.toString() + "Meta de Vendas:" + metaVendas;
   }
    
    
}
