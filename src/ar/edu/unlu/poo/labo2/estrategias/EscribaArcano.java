package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class EscribaArcano implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Pergamino")){
            if(artefacto.getNivelPoder()<30){
                artefacto.setNivelPoder(artefacto.getNivelPoder()+25);
            }else{
                artefacto.setNivelPoder(artefacto.getNivelPoder()-10);
            }

        }
    }
}
