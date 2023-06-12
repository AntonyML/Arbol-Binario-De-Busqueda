/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbolbinariodebusqueda;

/**
 *
 * @author TonyML
 */
class Nodo {

    private int key;
    private String name, carnet, carrera;
    private Nodo left;
    private Nodo right;

    public Nodo(int key, String n, String c, String r) {
        this.name = n;
        this.carnet = c;
        this.carrera = r;
        this.key = key;
        left = right = null;
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

  

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Nodo getLeft() {
        return left;
    }

    public void setLeft(Nodo left) {
        this.left = left;
    }

    public Nodo getRight() {
        return right;
    }

    public void setRight(Nodo right) {
        this.right = right;
    }

}
