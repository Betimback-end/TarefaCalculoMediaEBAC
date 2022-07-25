public class Main {
    public static void main(String[] args) {
        calculoMedia();
    }
    public static void calculoMedia(){
        //iniciando com valores das notas
        double result = 0 ;
        double nota1 = 45.22;
        double nota2 = 38.82;
        double nota3 = 61.02;
        double nota4 = 79.12;
        //Calculos de media das notas
        result = (nota1 + nota2 + nota3 + nota4) / 4 ;
        if (result > 50){
            System.out.println("Aprovado" );
            System.out.println("O valor da media e = " + result );
        } else if (result < 48 && result > 40) {
            System.out.println("Recuperacao" );
            System.out.println("O valor da media e = " + result );
        }else

        System.out.println("Reprovado  " + result );
    }
}
