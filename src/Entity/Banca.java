/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author luis carlos
 */
public class Banca {
    
    private int idbanca;
    private String data;
    private String hora;
    private String local;
    private String professores;

    public String getProfessores() {
        return professores;
    }

    public void setProfessores(String professores) {
        this.professores = professores;
    }

    public int getIdbanca() {
        return idbanca;
    }

    public void setIdbanca(int idbanca) {
        this.idbanca = idbanca;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    
    
    
    
}
