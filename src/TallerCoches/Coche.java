package TallerCoches;

/**
 * Created by 48092788H on 03/10/2016.
 */
public class Coche {
    private String Matricula;
    private String Marca;
    private String Modelo;
    private double Precio;

public Coche(String Matricula, String Marca, String Modelo, double Precio){
    this.Matricula=Matricula;
    this.Marca=Marca;
    this.Modelo=Modelo;
    this.Precio=Precio;
}

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coche coche = (Coche) o;

        if (Double.compare(coche.Precio, Precio) != 0) return false;
        if (Matricula != null ? !Matricula.equals(coche.Matricula) : coche.Matricula != null) return false;
        if (Marca != null ? !Marca.equals(coche.Marca) : coche.Marca != null) return false;
        return Modelo != null ? Modelo.equals(coche.Modelo) : coche.Modelo == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = Matricula != null ? Matricula.hashCode() : 0;
        result = 31 * result + (Marca != null ? Marca.hashCode() : 0);
        result = 31 * result + (Modelo != null ? Modelo.hashCode() : 0);
        temp = Double.doubleToLongBits(Precio);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "TallerCoches.Coche{" +
                "Matricula='" + Matricula + '\'' +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", Precio=" + Precio +
                '}'+System.lineSeparator();
    }
}