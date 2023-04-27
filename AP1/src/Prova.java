public class Prova {
    double notaParte1;
    double notaParte2;

    double calcularNotaTotal() {
        double notaTotal = notaParte1 + notaParte2;

            if (notaTotal>10){
                return 0;
            }
            else {
                return notaTotal;
            }
    }



}
