package alexander.EmpleadoAplication.Entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "direccion")
public class Direccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cod_direccion;
    String municipio;

    @OneToOne(mappedBy = "dir")
    Empleado empleado;
    public Direccion(String municipio) {
        this.municipio = municipio;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public int getCod_direccion() {
        return cod_direccion;
    }

    public void setCod_direccion(int cod_direccion) {
        this.cod_direccion = cod_direccion;
    }
}
