
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        Tempo tempo = new Tempo();
        tempo.subscribe(pessoa1);
        tempo.subscribe(pessoa2);

        tempo.setTempo("Dia Claro");

        tempo.unsubscribe(pessoa2);

        tempo.setTempo("Dia de Chuva");


    }

}
