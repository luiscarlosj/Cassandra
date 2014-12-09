/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conection.Conexao;
import Entity.Curso;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 *
 * @author luis carlos
 */
public class CursoDAO {
    
    Conexao conexao = new Conexao();
    Session session;
    
    
    public CursoDAO()  {
        this.session = conexao.connect();
    }
    
    public void adicionar (Curso curso)
    {
       this.session.execute (
          " INSERT  INTO monografia.curso (id_curso, nome) "+
          " VALUES ( "+curso.getIdcurso()+",'"+curso.getNome()+"');");
           
    }
    
    public void deletar (Curso curso)
    {
        this.session.execute (
          " DELETE FROM monografia.aluno WHERE matricula="+curso.getIdcurso()+";");   
      
    }
    
    public void alterar (Curso curso)
    {
        this.session.execute (
          " UPDATE monografia.curso SET nome='"+curso.getNome()+"' WHERE id_curso="+curso.getIdcurso()+";");
    
    }
    
    public void consultar (Curso curso)
    {
        ResultSet results = session.execute("select * from monografia.curso where id_curso="+curso.getIdcurso()+";");
        
        for (Row row : results) 
        {
           System.out.format("id: %d\tnome:%s\n",  
           row.getInt("id_curso"), row.getString("nome"));
        }
    
    }
    
    public void desconectar ()
    {
        conexao.close();
    }
     
    
}
