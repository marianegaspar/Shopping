public class Informatica extends Loja{

    //atributos
    protected double seguroEletronicos;

    //construtor para inicializar todos os atributos
    public Informatica(String n, int q, double s, Endereco e,Data d,int quantProdutos, double seguroEletronicos){
        super(n, q, s, e, d, q);//chamando o construtor da superclasse
        this.seguroEletronicos=seguroEletronicos;
    }
    
    //métodos de acesso
    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos=seguroEletronicos;
    }
    
    @Override
   public String toString(){
    return super.toString() + "\n Valor do seguro: " +seguroEletronicos;
   }
    
}
