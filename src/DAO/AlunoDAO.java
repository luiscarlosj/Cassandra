/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conection.Conexao;
import Entity.Aluno;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 *
 * @author luis carlos
 */
public class AlunoDAO {
    
    
    Conexao conexao = new Conexao();
    Session session;
    
    
    public AlunoDAO()  {
        this.session = conexao.connect();
    }
    
    public void adicionar (Aluno aluno)
    {
        this.session.execute (
          " INSERT  INTO monografia.aluno (matricula, nome, curso_idcurso) "+
          " VALUES ( "+aluno.getMatricula()+",'"+aluno.getNome()+"',"+aluno.getCurso_idcurso()+");");           
    }
    
    public void deletar (Aluno aluno)
    {
         this.session.execute (
          " DELETE FROM monografia.aluno WHERE matricula="+aluno.getMatricula()+";");   
    
    }
    
    public void alterar (Aluno aluno)
    {
          this.session.execute (
          " UPDATE monografia.aluno SET nome='"+aluno.getNome()+"' WHERE matricula="+aluno.getMatricula()+";");
    
    }
    
    public void consultar (Aluno aluno)
    {
        ResultSet results = session.execute("select * from monografia.aluno where matricula="+aluno.getMatricula()+";");
        
        for (Row row : results) 
        {
           System.out.format("matricula: %d\tnome:%s\tcurso:%s\n", row.getInt("matricula"), row.getString("nome"), row.getInt("curso_idcurso") );
        }
    
    }
    
    public void desconectar ()
    {
        conexao.close();
    }
    
    
     
    
}
