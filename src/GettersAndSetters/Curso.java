package GettersAndSetters;


public class Curso {
    private String nombreCurso;
    private double nota1;
    private double nota2;
    private double nota3;

    private boolean validarNota(double nota) {
        return nota >= 0 && nota <= 100;
    }

    public String getNombreCurso() { return nombreCurso; }
    public void setNombreCurso(String nombreCurso) { this.nombreCurso = nombreCurso; }

    public void setNota1(double nota) { if(validarNota(nota)) this.nota1 = nota; else System.out.println("Nota 1 inválida."); }
    public void setNota2(double nota) { if(validarNota(nota)) this.nota2 = nota; else System.out.println("Nota 2 inválida."); }
    public void setNota3(double nota) { if(validarNota(nota)) this.nota3 = nota; else System.out.println("Nota 3 inválida."); }

    public double promedio() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public String estado() {
        return promedio() >= 61 ? "Aprobado" : "Reprobado";
    }
}
