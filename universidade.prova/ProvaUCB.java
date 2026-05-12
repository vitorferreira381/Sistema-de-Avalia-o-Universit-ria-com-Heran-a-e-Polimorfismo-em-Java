
package universidade.prova;

public class ProvaUCB extends ProvaUniversidade {
    public ProvaUCB(double nota1, double nota2) {
        av1 = nota1;
        av2 = nota2;
        pesoAv1 = 1;
        pesoAv2 = 1;
        pesoAv3 = 1;
        mediaMinima = 7.0;
    }

    @Override
    public double calcularMedia() {
        if (realizouProvaFinal) {
            if (av1 < av2) {
                return (av2 + av3) / 2;
            } else {
                return (av1 + av3) / 2;
            }
        }
        return (av1 + av2) / 2;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade() {
        ProvaAV3UCB provaFinal = new ProvaAV3UCB();
        provaFinal.provaOriginal = this;
        return provaFinal;
    }
}
