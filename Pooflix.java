package Parcial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pooflix {
    private List<Material> material;
    public static final int CAPACIDAD=15;

    public Pooflix(List<Material>material){
        this.material = new ArrayList<>();
    }
    public boolean agregarMaterial(Material){
        if(this.material.size()<15){
            this.material.add(material);
            return true;
        }
        return false;

    }
    public boolean retirarMaterial(int codigo){
        if(this.material.size()<15){
            this.material.remove(material);
            return true;
        }
        return false;
    }
    public Material buscarMaterial(int codigo){
        Material material= this.material.stream()
                .filter(m -> m.getCodigo()==codigo)
                .findFirst()
                .orElse(null);

        return material;
    }
    public Material buscarMaterial(String nombre){
        Material material=null;

        for (Material m=this.material){
            if(m.getNombre().equalsIgnoreCase(nombre)){
                material=m;
            }
        }
        return material;

    }
    public List<Material> buscarPorTipo(String Tipo){
        Material material=null;

        for (Material m=this.material){
            if(m.getTipo().equalsIgnoreCase(tipo)){
                material=m;
            }
        }
        return material;

    }
    public int calcularDuracionTotal(){
        Material material= null;
        for(Material m= this.buscarPorTipo(calcularDuracionTotal))
            if(m.getDuracion().equals(duracion))
                material=m;


        return calcularDuracionTotal();

    }
    public List<Material> ordenarPorCodigo(){

        return null;

    }

}
