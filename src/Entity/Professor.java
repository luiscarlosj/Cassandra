/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author luis carlos
 */
public class Professor {
    
    private int matricula_prof;

    public int getMatricula_prof() {
        return matricula_prof;
    }

    public void setMatricula_prof(int matricula_prof) {
        this.matricula_prof = matricula_prof;
    }

    public int getCurso_idcurso() {
        return curso_idcurso;
    }

    public void setCurso_idcurso(int curso_idcurso) {
        this.curso_idcurso = curso_idcurso;
    }

    public String getNome_prof() {
        return nome_prof;
    }

    public void setNome_prof(String nome_prof) {
        this.nome_prof = nome_prof;
    }
    private int curso_idcurso;
    private String nome_prof;
    
    
}
