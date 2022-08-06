package kaike;

public class Third {

    String job;
    double slr;

    Third() {
    }

    Third(String job, double slr) {
        this.job = job;
        this.slr = slr;
    }

    String myJob(Second j) {
        return String.format("Meu nome é %s %s e trabalho como %s ganhando R$%.2f\n", j.nome, j.sobrenome, job, slr);
    }

}
