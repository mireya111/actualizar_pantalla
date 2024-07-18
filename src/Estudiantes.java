public class Estudiantes {
    String cedula;
    float nota1;
    float nota2;
    /*Constructores*/
    public Estudiantes(){}
    public Estudiantes(String cedula, float nota1, float nota2) {
        this.cedula = cedula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    /*Setters y getters*/
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
}
