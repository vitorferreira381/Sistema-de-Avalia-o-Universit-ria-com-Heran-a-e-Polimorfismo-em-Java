
package universidade.prova;

public class ProvaFafifo extends ProvaUniversidade {
    public ProvaFafifo(double nota1, double nota2) {
        av1 = nota1;
        av2 = nota2;
        pesoAv1 = 1;
        pesoAv2 = 1;
        pesoAv3 = 3;
        mediaMinima = 6.0;
    }

    @Override
    public double calcularMedia() {
        if (realizouProvaFinal) {
            return (av1 * pesoAv1 + av2 * pesoAv2 + av3 * pesoAv3) / (pesoAv1 + pesoAv2 + pesoAv3);
        }
        return (av1 * pesoAv1 + av2 * pesoAv2) / (pesoAv1 + pesoAv2);
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        ProvaFinalFafifo provaFinal = new ProvaFinalFafifo();
        provaFinal.provaOriginal = this;
        return provaFinal;
    }
}

