package universidade.prova;

public abstract class ProvaFinalUniversidade {
    protected double notaFinal;
    protected double pesoFinal;
    protected boolean realizou;
    protected ProvaUniversidade provaOriginal;

    public abstract boolean habilitadoRealizarProva();
}