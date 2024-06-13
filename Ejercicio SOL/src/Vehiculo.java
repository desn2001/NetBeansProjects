/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author desn2
 */
public abstract class Vehiculo {
    private String matricula;
    private String marca_modelo;
    private boolean alquilado;
    protected TipoVehiculo tipo;

    public Vehiculo(String matricula, String marca_modelo) {
        this.matricula = matricula;
        this.marca_modelo = marca_modelo;
        this.alquilado = false;
    }
    
    //GETTER/SETTER

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca_modelo() {
        return marca_modelo;
    }

    public void setMarca_modelo(String marca_modelo) {
        this.marca_modelo = marca_modelo;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    
    //METODOS PROPIOS
    public abstract void alquilar();
    public abstract void devolver();
    
    public void imprimir(){
        System.out.printf("%10s %s",this.matricula,this.marca_modelo);
    }
    
    
    
}
