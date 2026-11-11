public abstract class Persona {
    private Long id;
    private String nombre;
    private String password;

    public Persona(Long id, String nombre, String password) {
        this.id = id;
        this.nombre = nombre;
        this.password = password;
    }



    public boolean iniciarSesion(String nombre, String password){
        return getNombre().equals(nombre) && getPassword().equals(password);
    }


    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    
}
