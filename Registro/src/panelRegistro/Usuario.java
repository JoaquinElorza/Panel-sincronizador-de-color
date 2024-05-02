package panelRegistro;

public class Usuario {
  private String nombre, constraseña;

    public Usuario(String nombre, String constraseña) {
        this.nombre = nombre;
        this.constraseña = constraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public String getConstraseña() {
        return constraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConstraseña(String constraseña) {
        this.constraseña = constraseña;
    }
  
  
}
