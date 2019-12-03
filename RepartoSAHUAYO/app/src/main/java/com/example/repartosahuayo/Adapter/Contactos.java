package com.example.repartosahuayo.Adapter;

public class Contactos {
    private String contacto;
    private String tipo_contacto;
    public Contactos(String contacto, String tipo_contacto){
        this.contacto = contacto;
        this.tipo_contacto = tipo_contacto;
    }
    public String getContacto(){
        return contacto;
    }

    public String getTipo_contacto() {
        return tipo_contacto;
    }
}
