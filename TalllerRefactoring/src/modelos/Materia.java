package modelos;

public class Materia {
    private String codigo;
    private String nombre;
    private String facultad;
    private double notaInicial;
    private double notaFinal;
    private double notaTotal;
    
    public double getNotaInicial(){
        return notaInicial;
    }
    
    public double getNotaFinal(){
        return notaFinal;
    }
}
