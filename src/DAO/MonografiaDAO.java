/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conection.Conexao;
import Entity.Monografia;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 *
 * @author luis carlos
 */
public class MonografiaDAO {
    
    Conexao conexao = new Conexao();
    Session session;
    
    
    public MonografiaDAO()  {
        this.session = conexao.connect();
    }
    
    public void adicionar (Monografia monografia)
    {
        this.session.execute (
          " INSERT  INTO monografia.monografia (idmonografia, aluno_matricula, banca_idbanca, nota, titulo) "+
          " VALUES ( "+monografia.getIdmonografia()+
                     ","+monografia.getAluno_matricula()+
                     ","+monografia.getBanca_idbanca()+
                     ","+monografia.getNota()+
                     ",'"+monografia.getTitulo()+"');"); 
           
    }    
    public void deletar (Monografia monografia)
    {
        this.session.execute (
          " DELETE FROM monografia.aluno WHERE matricula="+monografia.getIdmonografia()+";"); 
    
    }
    
    public void alterar (Monografia monografia)
    {
        this.session.execute (
          " UPDATE monografia.monografia SET titulo='"+monografia.getTitulo()+"' WHERE idmonografia="+monografia.getIdmonografia()+";");
    
    }
    
    public void consultar (Monografia monografia)
    {
        ResultSet results = session.execute("select * from monografia.monografia where idmonografia="+monografia.getIdmonografia()+";");
        
        for (Row row : results) 
        {
           System.out.format("id: %d\taluno:%d\tbanca:%d\tnota:%f\ttitulo:%s\n", row.getInt("idmonografia"), 
           row.getInt("aluno_matricula"), row.getInt("banca_idbanca"), row.getFloat("nota"), row.getString("titulo"));
        }
    
    }
    
    public void desconectar ()
    {
        conexao.close();
    }
     
    
}
