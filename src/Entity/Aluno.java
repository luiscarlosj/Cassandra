/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author luis carlos
 */
public class Aluno {
    
    private int matricula;
    private String nome;
    private int curso_idcurso;

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCurso_idcurso() {
        return curso_idcurso;
    }

    public void setCurso_idcurso(int curso_idcurso) {
        this.curso_idcurso = curso_idcurso;
    }
    
}
