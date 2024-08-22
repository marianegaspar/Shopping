public class Endereco {
    
    //atributos
    public String nomeDaRua,numero,complemento,cidade,
    estado, pais, cep;

    //construtores
    public Endereco (String nomeDaRua, String numero, String complemento,String cidade, 
    String estado, String pais, String cep){

        this.nomeDaRua=nomeDaRua;
        this.numero=numero;
        this.complemento=complemento;
        this.cidade= cidade;
        this.estado=estado;
        this.pais=pais;
        this.cep=cep;
       
    }

    //acesso

    public String getNomeDaRua(){
        return nomeDaRua;
    }

    public void setNomeDaRua(String nomeDaRua){
        this.nomeDaRua=nomeDaRua;
    }
    
    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade=cidade;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
         this.estado=estado;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais=pais;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep=cep;
    }

    public String getNumero(){
        return numero;
    }

    public void setNumero(String numero){
        this.numero=numero;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento=complemento;
    }

    //toString
    public String toString(){
        return "Nome da rua: " + getNomeDaRua() + " Número:" + getNumero() +
         "Complemento: " + getComplemento() + "\n Cidade: " +getCidade() + "Estado: " +getEstado() 
        + "\n País: " +getPais() + "\n CEP: " + getCep() ;
    }

}
