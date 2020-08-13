package modelos;



public class Telefono {
    private String number;
    private String operadora;
    private Persona propetario;

    public Telefono(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public Persona getPropetario() {
        return propetario;
    }

    public void setPropetario(Persona propetario) {
        this.propetario = propetario;
    }
}
