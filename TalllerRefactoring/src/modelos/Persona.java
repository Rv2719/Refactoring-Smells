public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected Direccion direccion;
    protected Telefono telefono;
    protected List<Paralelo> paralelos;
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion.getCallePrincipal();
    }

    public void setDireccion(String direccion) {
        this.direccion = new Direccion(direccion);
    }

    public String getTelefono() {
        return telefono.getNumber();
    }

    public void setTelefono(String telefono) {
        this.telefono = new Telefono(telefono);
    }

    public List<Paralelo> getParalelos() {
        return paralelos;
    }

    public void setParalelos(List<Paralelo> paralelos) {
        this.paralelos = paralelos;
    }
    
    
}