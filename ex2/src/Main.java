public class Main {
    public static void main(String[] args) {
        int numero= 4;
        int divisiveis= 0;

        for (int i=1; i<=numero;i++){
            if (numero%i==0){
                divisiveis=divisiveis+1;

            }
           if(divisiveis==2){
               System.out.println("O número" + i + " é primo.");
           }
           else {
               System.out.println("O número" + i + " não é primo.");
           }
        }
    }
}