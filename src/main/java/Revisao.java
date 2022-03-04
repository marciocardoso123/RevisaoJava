public class Revisao {
//git@github.com:marciocardoso123/RevisaoJava.git
    //toda class principal precisa de metodo principal static void main
    //usa variaveis primitivas fortemente tipada
    //todas a Exception ou class precisão ser com iniciais maiusculas por tratar de POO

    //tratamento de exception TRY{ bolco monitorado para erro}
    // CATCH(tipo de excepition){tratamento de erro}

    public static void main (String[] args){

        try {
            int[] vetor = new int[4];
            System.out.println("Antes da exception");
            vetor[4] = 1;
            System.out.println("Esse testo não será impresso por tentar atribuir valor em posição de vetor que n existe");
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Excessão de acesso a indice inexistente");
        }
        System.out.println("Esse teste não será impresso");
        }


}
