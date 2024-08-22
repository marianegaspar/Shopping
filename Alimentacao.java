public class Alimentacao extends Loja {

    //atributos 
    public Data dataAlvara;

     //construtor para inicializar todos os atributos
     public Alimentacao(String n, int q, double s, Endereco e,Data d, int quantProdutos,Data dataAlvara){
        //super(n,q,s,e,d);//chamando o cosntrutor da superclasse
        super(n, q, s, e, d,q);
        this.dataAlvara=dataAlvara;
    }

    //métodos de acesso
    public Data getDataAlvara(){
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara=dataAlvara;
    }
    
    @Override
   public String toString(){
    return  super.toString() + "Data alvará: " +getDataAlvara();
   }

}
