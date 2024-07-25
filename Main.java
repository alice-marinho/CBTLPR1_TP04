
public class Main {

     public static void main(String[] args) {
        Data data = new Data(23, 7, 2024);
        System.out.println("Data formatada 1: " + data.mostra1());
        System.out.println("Data formatada 2: " + data.mostra2());
        System.out.println("Ano bissexto: " + data.bissexto());
        System.out.println("Dias transcorridos: " + data.diasTranscorridos());
        data.apresentaDataAtual();
    }
}
   