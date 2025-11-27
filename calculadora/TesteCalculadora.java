package calculadora;

public class TesteCalculadora {
    /*
    *Método para teste da calculadora
    *
    * Criou-se 4 testes, 1 de cada operador matemático.
    */

    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println(calc.calcular(2,3,"+"));
        System.out.println(calc.calcular(10,4,"-"));
        System.out.println(calc.calcular(3,5,"*")); 
        System.out.println(calc.calcular(8,2,"/"));



    /*
    *Criação do Try Catch para prevenir erros matemáticos na calculadora
    *
    * O Try é o teste "Errado" para conferir se está funcionando, e o Catch vai aparecer a mensagem que foi 
    * demonstrada no código Calculadora.java    
    * 
    *  
    */

        try{
            System.out.println(calc.calcular(8, 0, "/")); //Exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try{
            System.out.println(calc.calcular(8, 0, "x")); //Exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
