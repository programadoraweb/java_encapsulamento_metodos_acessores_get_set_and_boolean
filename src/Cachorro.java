public class Cachorro {
    private int idade; 
    // so vou conseguir acessar esse atributo por um metodo acessorio porque eh privado

    public void setIdade(int i){
        //settar a idade, inserir a idade
        idade = i;
    }

    public int getIdade(){
        // recebo o valor// recebo a idade.
        return idade; 
    }

    public void Andar(){
        System.out.println("Estou andando");

    }

    public boolean VerificarIdade(){
        // vai retornar sim ou nao, true ou false
        if(idade > 10){ return true; 

        }else{
            return false;
        }
    }
    
}
