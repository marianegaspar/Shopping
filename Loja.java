public class Loja {
    
    //atributos
    public String nome;
    protected int  quantidadeFuncionarios;
    protected double salarioBaseFuncionario;
    public Endereco endereco;
    public Data dataFundacao;
    public Produto[] estoqueProdutos;

    //construtores
       
    public Loja(){
        nome = null; 
        salarioBaseFuncionario=-1.0;
    }
        
    public Loja (String nome,int quantidadeFuncionarios,double salarioBaseFuncionario,
    Endereco endereco, Data dataFundacao,int quantProdutos){
        this.nome = nome;        
        this.quantidadeFuncionarios=quantidadeFuncionarios;     
        this.salarioBaseFuncionario=salarioBaseFuncionario;
        this.endereco=endereco;
        this.dataFundacao=dataFundacao;
        //instanciando o array
        this.estoqueProdutos = new Produto[quantProdutos];
        for(int i=0; i<estoqueProdutos.length; i++)
            estoqueProdutos[i] = null;
    }
   
    //métodos de acesso

    public Loja(String nome, int quantidadeFuncionarios, Endereco e1, Data d1, int quantProdutos) {
        this.nome = nome;        
        this.quantidadeFuncionarios=quantidadeFuncionarios;     
        this.endereco=e1;
        this.dataFundacao=d1;
        this.salarioBaseFuncionario=-1;
        //instanciando o array
        this.estoqueProdutos = new Produto[quantProdutos];
        for(int i=0; i<estoqueProdutos.length; i++)
            estoqueProdutos[i] = null;
    }


    public String getNome(){
        return nome;
    }
   
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios=quantidadeFuncionarios;
    }

   public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
   }
   
   public void setSalarioBaseFuncionario(double salarioBaseFuncionario ){
        this.salarioBaseFuncionario=salarioBaseFuncionario;
    
   }

   public Endereco getEndereco(){
        return endereco;
}

    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
}

    public Data getDataFundacao(){
        return dataFundacao;
}

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
}

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
}

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos=estoqueProdutos;
}

   //toString

   @Override
   public String toString(){
    return "Nome da Loja: " +getNome() + " \n Quantidade de funcionários: " + getQuantidadeFuncionarios() 
    + "\n Salário base dos funcionários: " + getSalarioBaseFuncionario() + "\n Endereço: " + getEndereco() 
    + "\n Data de Fundação" + getDataFundacao() + "\n Produtos no estoque: " + getEstoqueProdutos();
   }

      
   //outros métodos

   public double gastosComSalario(){

        if(salarioBaseFuncionario > 0){
             return (salarioBaseFuncionario*quantidadeFuncionarios);
        }
        
            return -1.0;
         
   }
   
   public char tamanhoDaLoja(){
    if (quantidadeFuncionarios<10)
       return 'P';
    else if (quantidadeFuncionarios ==10 || quantidadeFuncionarios <=30)
        return 'M';
    else if (quantidadeFuncionarios >= 31)
        return 'G';
    else
        return 0;       
    }

    public void imprimeProdutos(){

        for(int i =0; i<estoqueProdutos.length; i++){
            if (estoqueProdutos[i] != null) {
                 System.out.println(estoqueProdutos[i] + " | ");
            }
        }
    }

    public boolean insereProduto(Produto produto){

        for(int i=0; i<estoqueProdutos.length; i++)
            if (estoqueProdutos[i] == null){
             estoqueProdutos[i] = produto;
             return true; 
        }  
     
     return false;

    }

    public boolean removeProduto(String nomeProduto){
        for(int i=0; i<estoqueProdutos.length;i++)
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equalsIgnoreCase(nomeProduto)){
                estoqueProdutos[i] = null;
                return true;
            }

        return false;

    }






}


   
   
    
   


