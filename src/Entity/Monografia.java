/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author luis carlos
 */
public class Monografia {
    
    private int idmonografia;
    private int aluno_matricula;
    private int banca_idbanca;
    private float nota;
    private String titulo;

    public int getIdmonografia() {
        return idmonografia;
    }

    public void setIdmonografia(int idmonografia) {
        this.idmonografia = idmonografia;
    }

    public int getAluno_matricula() {
        return aluno_matricula;
    }

    public void setAluno_matricula(int aluno_matricula) {
        this.aluno_matricula = aluno_matricula;
    }

    public int getBanca_idbanca() {
        return banca_idbanca;
    }

    public void setBanca_idbanca(int banca_idbanca) {
        this.banca_idbanca = banca_idbanca;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
    
}
