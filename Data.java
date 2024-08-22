public class Data {
    
    //atributos
    private int dia, mes, ano;

    //construtores
    public Data( int dia, int mes, int ano){

        this.ano=ano;
        if(dia >=1 & dia <=31) {
            this.dia = dia;
        } else {
            System.out.println("Data inválida!");        
            dia = 1; mes=1;ano=2000;
            return;
        }
            

        if (mes>=1 & mes<=12) {
            this.mes=mes;
        } else {
            System.out.println("Data inválida!");        
            dia = 1; mes=1;ano=2000;
            return;
        }
            
        
        if(verificaAnoBissexto()==false && mes == 2 && dia == 29){
            System.out.println("Data inválida!");   
            dia = 1; mes=1;ano=2000;
        }
        
             
    }

    //acesso
    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia=dia;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes=mes;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano=ano;
    }

    //toString

    public String toString(){
    return dia+"/"+mes+"/"+ano;
    }

    //verificaAnoBissexto:
    public boolean verificaAnoBissexto(){
     if (ano % 4 == 0 & ano%100 != 0 )
        return true;
    else if (ano%100 == 0 & ano%400 ==0)
        return true;
    else
        return false; 
    }

}
