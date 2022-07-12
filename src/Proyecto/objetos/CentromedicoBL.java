package Proyecto.objetos;

public class CentromedicoBL {
    private int IDCentroMedico;
    private String nombre;
    private String tipo;
    private String region;
    private String ciudad;

    public int getIDCentroMedico() {
        return IDCentroMedico;
    }

    public void setIDCentroMedico(int IDCentroMedico) {
        this.IDCentroMedico = IDCentroMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}