/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conection.Conexao;
import Entity.Professor;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 *
 * @author luis carlos
 */
public class ProfessorDAO {
    
    Conexao conexao = new Conexao();
    Session session;
    
    
    public ProfessorDAO()  {
        this.session = conexao.connect();
    }
    
    public void adicionar (Professor professor)
    {
        this.session.execute (
          " INSERT  INTO monografia.professor (matricula_prof, curso_idcurso, nome_prof) "+
          " VALUES ( "+professor.getMatricula_prof()+","+professor.getCurso_idcurso()+",'"+professor.getNome_prof()+"');"); 
           
    }
    
    public void deletar (Professor professor)
    {
        this.session.execute (
          " DELETE FROM monografia.aluno WHERE matricula="+professor.getMatricula_prof()+";"); 
    
    }
    
    public void alterar (Professor professor)
    {
        this.session.execute (
          " UPDATE monografia.professor SET nome_prof='"+professor.getNome_prof()+"' WHERE matricula_prof="+professor.getMatricula_prof()+";");
    
    }
    
    public void consultar (Professor professor)
    {
        ResultSet results = session.execute("select * from monografia.professor where matricula_prof="+professor.getMatricula_prof()+";");
        
        for (Row row : results) 
        {
           System.out.format("matricula: %d\tcurso:%s\tnome:%s\n", row.getInt("matricula_prof"), 
           row.getInt("curso_idcurso"), row.getString("nome_prof"));
        }
    
    }
    
    public void desconectar ()
    {
        conexao.close();
    }
     
    
}
