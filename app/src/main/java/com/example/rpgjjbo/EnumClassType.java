package com.example.rpgjjbo;

/**
 * Enumerador de tipos de clase de presonaje
 *
 * @author Jose J. Bailon Ortiz
 */
public enum EnumClassType {
    humano(R.string.humano,0,R.drawable.human,R.string.human_desc,3,4),
    elfo(R.string.elfo,1,R.drawable.elf,R.string.elf_desc,4,3),
    enano(R.string.enano,2,R.drawable.dwarf,R.string.dwarf_desc,5,2),
    orco(R.string.orco,3,R.drawable.orc,R.string.orc_desc,3,3);

    /**
     * Nombre de la clase
     */
    final int nombre;
    /**
     * Id de la clase
     */
    final int id;

    final int imagen;

    final int descripcion;
    final int vida;
    final int fuerza;

    /**
     *
     * @param nombre
     * @param id

     */
    EnumClassType(int nombre, int id , int imagen, int descripcion,int vida, int fuerza) {
        this.nombre=nombre;
        this.id=id;
        this.imagen=imagen;
        this.descripcion=descripcion;
        this.vida=vida;
        this.fuerza=fuerza;


    }
    public int getNombre(){
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getImagen() {
        return imagen;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }
}
