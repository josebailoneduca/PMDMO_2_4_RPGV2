package com.example.rpgjjbo;

/**
 * Enumerador de tipos de clase de presonaje
 *
 * @author Jose J. Bailon Ortiz
 */
public enum EnumClassType {
    humano(R.string.humano,0,R.drawable.human),
    elfo(R.string.elfo,1,R.drawable.elf),
    enano(R.string.enano,2,R.drawable.dwarf),
    orco(R.string.orco,3,R.drawable.orc);

    /**
     * Nombre de la clase
     */
    final int nombre;
    /**
     * Id de la clase
     */
    final int id;

    final int imagen;

    /**
     *
     * @param nombre
     * @param id

     */
    EnumClassType(int nombre, int id , int imagen) {
        this.nombre=nombre;
        this.id=id;
        this.imagen=imagen;


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
}
