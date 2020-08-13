public class Direccion{
    private String callePrincipal;
    private String calleSecundaria;
    private String codigoPostal;

    public Direccion(String callePrincipal, String calleSecundaria) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }

    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}