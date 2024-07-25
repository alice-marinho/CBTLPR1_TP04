
public class Main {

     public static void main(String[] args) {
        Data dataDigitada = new Data();
        System.out.println("Data formatada 1: " + dataDigitada.mostra1());
        System.out.println("Data formatada 2: " + dataDigitada.mostra2());
        System.out.println("Ano bissexto: " + dataDigitada.bissexto());
        System.out.println("Dias transcorridos: " + dataDigitada.diasTranscorridos());
        dataDigitada.apresentaDataAtual();

        System.out.println("----------------------------------------");
        System.out.println("Data por parametros: ");
        Data dataParametros = new Data(5,9,2021);
        System.out.println("Data formatada 1: " + dataParametros.mostra1());
        System.out.println("Data formatada 2: " + dataParametros.mostra2());
        System.out.println("Ano bissexto: " + dataParametros.bissexto());
        System.out.println("Dias transcorridos: " + dataParametros.diasTranscorridos());
        dataParametros.apresentaDataAtual();
    }
}
   