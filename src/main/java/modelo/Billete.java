/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author David Rebato
 */
public class Billete {
    private String FechaVuelo;
    private int cant;

    public Billete() {
    }

    public Billete(String FechaVuelo, int cant) {
        this.FechaVuelo = FechaVuelo;
        this.cant = cant;
    }
    
    public double getImporte(){
        double precio;
        int mes;
        mes = Integer.parseInt(this.FechaVuelo.substring(5,7));
        if(mes >= 5 && mes <= 9){ //temporada alta
            precio = 150.0;
        } else {
            precio = 90.0;
        }
        double precioSinIva = Math.round((precio*cant)*1.21*100);
        precioSinIva = precioSinIva/100;
        return precioSinIva;
    }

    public String getFechaVuelo() {
        return FechaVuelo;
    }

    public int getCant() {
        return cant;
    }
}
