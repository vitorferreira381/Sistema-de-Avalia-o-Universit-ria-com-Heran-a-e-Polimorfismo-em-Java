package universidade.prova;

public abstract class ProvaUniversidade {
    protected double av1, av2, av3;
    protected double pesoAv1, pesoAv2, pesoAv3;
    protected double mediaMinima;
    protected boolean realizouProvaFinal;

    public abstract double calcularMedia();
    public abstract ProvaFinalUniversidade getProvaFinalUniversidade();

    public boolean aprovado() {
        return calcularMedia() >= mediaMinima;
    }
}
