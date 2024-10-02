import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String universidad;
    private String lenguaje;
    private ArrayList<Programador> programadores;
    private final int tamaño = 3;

    public Equipo(String nombre, String universidad, String lenguaje) {
        this.nombre = nombre;
        this.universidad = universidad;
        this.lenguaje = lenguaje;
        programadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public boolean estaLleno() {
        return programadores.size() >= tamaño;
    }

    public void añadir(Programador programador) throws Exception {
        if (estaLleno()) {
            throw new Exception("El equipo está completo. No se pudo agregar programador");
        }
        programadores.add(programador);
    }

    static void validarCampo(String campo) throws Exception {
        for (int j = 0; j < campo.length(); j++) {
            char c = campo.charAt(j);
            if (Character.isDigit(c)) {
                throw new Exception("El nombre no puede tener dígitos");
            }
        }
        if (campo.length() > 20) {
            throw new Exception("La longitud no debe ser superior a 20 caracteres");
        }
    }
}
