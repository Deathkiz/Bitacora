package semana1;

public class Usuario {
    private String id;
    private String nombre;
    private int age;
    private boolean active;

    public Usuario(String id, String nombre, int age, boolean active) {
        this.id = id;
        this.nombre = nombre;
        this.age = age;
        this.active = active;
    }

    public String getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean isActive() {
        return active;
    }
    public int getAge(){
        return age;
    }
    public String setNombre(String name1){
        nombre = name1;
        return this.nombre;
    }
}
