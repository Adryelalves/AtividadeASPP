import java.util.ArrayList;
import java.util.List;
public class Tempo {
    private String previsaoTempo;
    private List<Pessoa> people = new ArrayList<>();

    public void subscribe(Pessoa pessoa) {
        this.people.add(pessoa);
    }

    public void unsubscribe(Pessoa pessoa) {
        this.people.remove(pessoa);
    }

    public void setTempo(String tempo) {
        this.previsaoTempo = tempo;

        for (Pessoa pessoa : this.people){
            pessoa.update(this.previsaoTempo);
        }
    }

}