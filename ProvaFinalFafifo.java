
package universidade.prova;

public class ProvaFinalFafifo extends ProvaFinalUniversidade {
    @Override
    public boolean habilitadoRealizarProva() {
        return !provaOriginal.aprovado();
    }

    public void realizarProva(double nota) {
        if (habilitadoRealizarProva()) {
            provaOriginal.av3 = nota;
            provaOriginal.realizouProvaFinal = true;
        }
    }
}