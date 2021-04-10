package Parcial;

import java.util.concurrent.LinkedTransferQueue;

public class Material {
    private int codigo;
    private String nombre;
    private int duracion;
    private String tipo;

    public Material() {}

    public Material(int codigo, String nombre, int duracion, String tipo){
        this. codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.tipo = tipo;

    }
    public int getCodigo(){
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDuracion(){
        return duracion;
    }
    public String getTipo(){
        return tipo;
    }
}
