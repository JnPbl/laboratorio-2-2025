package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class AlquimistaExperto implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Poción")){
            int poder = artefacto.getNivelPoder() + 20;
            if(poder > 100){
                artefacto.setNivelPoder(100);
            }else{
                artefacto.setNivelPoder(poder);
            }
        }
    }
}
