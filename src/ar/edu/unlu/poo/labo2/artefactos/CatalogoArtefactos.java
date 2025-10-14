package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

import java.util.*;

public class CatalogoArtefactos {
    private List<Artefacto> catalogo;
    private EstrategiaDeMejora estrategiaDeMejora;

    public CatalogoArtefactos(){
        catalogo = new ArrayList<>();
    }

    public CatalogoArtefactos(EstrategiaDeMejora estrategiaDeMejora){
        catalogo = new ArrayList<>();
        this.estrategiaDeMejora = estrategiaDeMejora;
    }

    public void agregarArtefacto(Artefacto artefacto) {
        catalogo.add(artefacto);
    }

    public Set<Artefacto> obtenerArtefactosUnicos() {
        Set<Artefacto> artefactoUnico = new HashSet<>();
        for(Artefacto artefacto : catalogo){
            artefactoUnico.add(artefacto);
        }
        return  artefactoUnico;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo) {
        List<Artefacto> lista = new ArrayList<>();
        for (Artefacto artefacto : catalogo){
            if(artefacto.getTipo() == tipo){
                lista.add(artefacto);
            };
        }
        return lista;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        Map<String, Integer> artefactoPorTipo = new HashMap<>();
        for (Artefacto artefacto: catalogo){
            artefactoPorTipo.put(artefacto.getTipo(),1);
        }

        return artefactoPorTipo;
    }
    public Artefacto obtenerArtefactoMasPoderoso() {
        if (catalogo == null || catalogo.isEmpty()) {
            return null;
        }
        return Collections.max(catalogo, Comparator.comparing(Artefacto::getNivelPoder));
    }


    public void aplicarMejoras(){
        for(Artefacto artefacto : catalogo){
            estrategiaDeMejora.mejorar(artefacto);
        }
    }
}
