package modelos;

public class InformacionAdicionalProfesor {
    public int añosdeTrabajo;
    public String facultad;
    public double BonoFijo;

    public double calcularSueldo(Profesor prof){
        return añosdeTrabajo*600 + BonoFijo;
   
    } 
    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double bonoFijo) {
        BonoFijo = bonoFijo;
    }

    
}
