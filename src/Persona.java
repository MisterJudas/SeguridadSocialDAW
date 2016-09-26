/**
 * Created by usu26 on 19/09/2016.
 */
public class Persona {
private String dni;
    private String numeroSeguridadSocial;

    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    public Persona(String dni, String numeroSeguridadSocial, String nombre, String apellido, int edad, double salario) {
        this.dni = dni;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (edad != persona.edad) return false;
        if (Double.compare(persona.salario, salario) != 0) return false;
        if (dni != null ? !dni.equals(persona.dni) : persona.dni != null) return false;
        if (numeroSeguridadSocial != null ? !numeroSeguridadSocial.equals(persona.numeroSeguridadSocial) : persona.numeroSeguridadSocial != null)
            return false;
        if (nombre != null ? !nombre.equals(persona.nombre) : persona.nombre != null) return false;
        return apellido != null ? apellido.equals(persona.apellido) : persona.apellido == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = dni != null ? dni.hashCode() : 0;
        result = 31 * result + (numeroSeguridadSocial != null ? numeroSeguridadSocial.hashCode() : 0);
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + edad;
        temp = Double.doubleToLongBits(salario);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


}
