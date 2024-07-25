import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor padrão
    public Data() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Digite o dia: ");
                int d = sc.nextInt();
                System.out.print("Digite o mês: ");
                int m = sc.nextInt();
                System.out.print("Digite o ano: ");
                int a = sc.nextInt();
                if (validaData(d, m, a)) {
                    this.dia = d;
                    this.mes = m;
                    this.ano = a;
                    valido = true;
                } else {
                    System.out.println("Data inválida, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente.");
                sc.next(); // Limpar o buffer do scanner
            }
        }
    }

    // Construtor com parâmetros
    public Data(int d, int m, int a) {
        if (validaData(d, m, a)) {
            this.dia = d;
            this.mes = m;
            this.ano = a;
        } else {
            throw new IllegalArgumentException("Data inválida.");
        }
    }

    // Métodos de entrada
    public void entraDia(int d) {
        if (validaData(d, this.mes, this.ano)) {
            this.dia = d;
        } else {
            throw new IllegalArgumentException("Dia inválido.");
        }
    }

    public void entraMes(int m) {
        if (validaData(this.dia, m, this.ano)) {
            this.mes = m;
        } else {
            throw new IllegalArgumentException("Mês inválido.");
        }
    }

    public void entraAno(int a) {
        if (validaData(this.dia, this.mes, a)) {
            this.ano = a;
        } else {
            throw new IllegalArgumentException("Ano inválido.");
        }
    }

    public void entraDia() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Digite o dia: ");
                int d = sc.nextInt();
                if (validaData(d, this.mes, this.ano)) {
                    this.dia = d;
                    valido = true;
                } else {
                    System.out.println("Dia inválido, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente.");
                sc.next(); // Limpar o buffer do scanner
            }
        }
    }

    public void entraMes() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Digite o mês: ");
                int m = sc.nextInt();
                if (validaData(this.dia, m, this.ano)) {
                    this.mes = m;
                    valido = true;
                } else {
                    System.out.println("Mês inválido, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente.");
                sc.next(); // Limpar o buffer do scanner
            }
        }
    }

    public void entraAno() {
        Scanner sc = new Scanner(System.in);
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print("Digite o ano: ");
                int a = sc.nextInt();
                if (validaData(this.dia, this.mes, a)) {
                    this.ano = a;
                    valido = true;
                } else {
                    System.out.println("Ano inválido, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, tente novamente.");
                sc.next(); // Limpar o buffer do scanner
            }
        }
    }

    // Métodos de retorno
    public int retDia() {
        return this.dia;
    }

    public int retMes() {
        return this.mes;
    }

    public int retAno() {
        return this.ano;
    }

    // Método para mostrar a data no formato dd/mm/aaaa
    public String mostra1() {
        return String.format("%02d/%02d/%04d", this.dia, this.mes, this.ano);
    }

    // Método para mostrar a data no formato dd/mesPorExtenso/ano
    public String mostra2() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return String.format("%02d/%s/%04d", this.dia, meses[this.mes - 1], this.ano);
    }

    // Método para verificar se o ano é bissexto
    public boolean bissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || (this.ano % 400 == 0);
    }

    // Método para calcular os dias transcorridos no ano até a data
    public int diasTranscorridos() {
        int[] diasPorMes = {31, (bissexto() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = 0;
        for (int i = 0; i < this.mes - 1; i++) {
            dias += diasPorMes[i];
        }
        dias += this.dia;
        return dias;
    }

    // Método para apresentar a data atual
    public void apresentaDataAtual() {
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println("Data atual: " + df.format(new Date()));
    }

    // Método para validar a data
    private boolean validaData(int d, int m, int a) {
        if (m < 1 || m > 12) return false;
        int[] diasPorMes = {31, (bissexto(a) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return d >= 1 && d <= diasPorMes[m - 1];
    }

    // Método auxiliar para verificar se um ano é bissexto
    private boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static void main(String[] args) {
        Data data = new Data(23, 7, 2024);
        System.out.println("Data formatada 1: " + data.mostra1());
        System.out.println("Data formatada 2: " + data.mostra2());
        System.out.println("Ano bissexto: " + data.bissexto());
        System.out.println("Dias transcorridos: " + data.diasTranscorridos());
        data.apresentaDataAtual();
    }
}