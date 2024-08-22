public class Shopping {

    // atributos
    public String nome;
    public Endereco endereco;
    public Loja [] lojas;
    

    //construtor

    public Shopping(String nome, Endereco endereco, int quantLojas){
        this.nome=nome;
        this.endereco=endereco;
        //instanciando o array lojas
        this.lojas = new Loja [quantLojas];
        for (int i=0; i<lojas.length; i++)
            lojas[i] = null;

    }

    //métodos de acesso

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco=endereco;
    }

    public Loja[] getLojas(){
        return lojas;
    }

    public void setLojas(Loja[] lojas){
        this.lojas=lojas;
    }

    public String toString(){
        return "Nome do Shopping: " + nome + "\n Endereço: " +getEndereco()
        + "Lojas: " + getLojas(); 
    }

    public boolean insereLoja(Loja loja){

        for(int i=0; i<lojas.length; i++)
            if(lojas[i] == null){
            lojas[i] = loja;
            return true;
            }

        return false;
    }

    public boolean removeLoja(String nomeLoja){

        for(int i =0; i<lojas.length; i++){
            if(lojas [i] != null && lojas[i].nome.equalsIgnoreCase(nomeLoja)){
                lojas[i] = null;
                return true;
            }
        }
        return false;
          
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        //contador
        int qtdLojas = 0;

        for(int i =0; i<lojas.length; i++){
            if(tipoLoja.equalsIgnoreCase("Informática") && lojas[i] instanceof Informatica){
                qtdLojas++;
            }
            else if (tipoLoja.equalsIgnoreCase("Cosmético") && lojas[i] instanceof Cosmetico){
                qtdLojas++;
            }
            else if (tipoLoja.equalsIgnoreCase("Vestuário") && lojas[i] instanceof Vestuario){
                qtdLojas++;
            }
            else if (tipoLoja.equalsIgnoreCase("Bijuteria") && lojas[i] instanceof Bijuteria){
                qtdLojas++;
            }
            else if (tipoLoja.equalsIgnoreCase("Alimentação") && lojas[i] instanceof Alimentacao){
                qtdLojas++;
            }
        } 

        if(qtdLojas >= 1){
            return qtdLojas;
        }
        else
            return -1;   
    }
    
    
    public Informatica lojaSeguroMaisCaro(){

        Informatica lojaSeguroMaisCaroInformatica = null;

        for(int i=0; i<lojas.length; i++){
            if(lojas[i] instanceof Informatica){
                Informatica lojaInformatica = (Informatica) lojas[i]; 
                if(lojaSeguroMaisCaroInformatica == null || lojaInformatica.getSeguroEletronicos() > lojaSeguroMaisCaroInformatica.getSeguroEletronicos()){
                    lojaSeguroMaisCaroInformatica = lojaInformatica ;
                }
            }
            
        }

        return lojaSeguroMaisCaroInformatica;
    
}

}
