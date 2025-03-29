package postgresql;

public class exercicio5 {
    public static void main(String[] args) {
        
        int idade = 60;

        if (idade >= 18 && idade <=65) {
            System.out.println(" A idade " + idade + " esta entre 18 e 65 ");    
        } else{
            System.out.println("A idade " + idade + " não esta entre 18 e 65");
        }
    }

}