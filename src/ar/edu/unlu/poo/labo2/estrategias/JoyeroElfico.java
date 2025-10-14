package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class JoyeroElfico implements EstrategiaDeMejora {

    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Amuleto")){
            if(artefacto.getNivelPoder()< 50){
                artefacto.setNivelPoder(artefacto.getNivelPoder()*2);
            }else{
                artefacto.setNivelPoder((int)(artefacto.getNivelPoder()*1.25));
            }
        }
    }
}
