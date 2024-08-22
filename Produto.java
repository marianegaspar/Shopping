public class Produto {

    //atributos
    public String nome;
    public double preco;
    public Data dataValidade;
   

    //construtores
    public Produto (String nome, double preco, Data dataValidade){
        this.nome=nome;
        this.preco=preco;
        this.dataValidade=dataValidade;
    }

    //acesso
    public String getNome(){
        return nome;
    }
   
    public void setNome(String nome){
        this.nome=nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco=preco;
    }

    
    public Data getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade=dataValidade;
    }
    
    //outros métodos

    public boolean estaVencido(Data data){

        if (data.getAno() > dataValidade.getAno()) {
            return true;
        } else if (data.getMes() > dataValidade.getMes()) {
            return true;
        } else if(data.getDia() > dataValidade.getDia()) {
            return true;
        }
                             
        return false;
               
    }

    //toString

    public String toString(){{
        return "Nome do Produto: " +getNome() +"\n Preço do produto: " +getPreco()+ 
        "\n Data de validade: " + getDataValidade();
        
    }

}
}
