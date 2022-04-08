package com.company;

public class cadira {
    public String color, material;
    public float precio;

    public cadira (String color, String material, float precio){
        this.setColor(color);
        this.setMaterial(material);
        this.setPrecio(precio);
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrecio() {
        return precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
