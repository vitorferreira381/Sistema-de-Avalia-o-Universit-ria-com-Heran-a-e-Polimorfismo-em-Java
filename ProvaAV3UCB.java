
package universidade.prova;

public class ProvaAV3UCB extends ProvaFinalUniversidade {
    @Override
    public boolean habilitadoRealizarProva() {
        return true;
    }

    public void realizarProva(double nota) {
        provaOriginal.av3 = nota;
        provaOriginal.realizouProvaFinal = true;
    }
}

