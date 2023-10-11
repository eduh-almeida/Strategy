public class Disciplina {
    private ICalcMedia calcMedia;
    private double media;
    private String nome;
    private double p1;
    private double p2;
    private String situacao;

    public Disciplina(String nome, double p1, double p2, ICalcMedia calcMedia) {
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.calcMedia = calcMedia;
        CalcularMedia();
    }

    public void CalcularMedia() {
        media = calcMedia.CalculaMedia(p1, p2);
        situacao = calcMedia.Situacao(media);
    }

    public double getMedia() {
        return media;
    }

    public String getNome() {
        return nome;
    }

    public double getP1() {
        return p1;
    }

    public double getP2() {
        return p2;
    }

    public String getSituacao() {
        return situacao;
    }
}
