/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariodebusqueda;

/**
 *
 * @author TonyML
 */
public class Estudiante {
    String name;
    String carnet;
    String carrera;

    public Estudiante(String name, String carnet, String carrera) {
        this.name = name;
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "name=" + name + ", carnet=" + carnet + ", carrera=" + carrera + '}';
    }
    
    
}
