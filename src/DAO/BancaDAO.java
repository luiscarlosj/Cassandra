/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conection.Conexao;
import Entity.Banca;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;



/**
 *
 * @author luis carlos
 */
public class BancaDAO {
    
    Conexao conexao = new Conexao();
    Session session;
    
    
    public BancaDAO()  {
        this.session = conexao.connect();
    }
    
    public void adicionar (Banca banca)
    {
        this.session.execute (
          " INSERT  INTO monografia.banca (idbanca, data, hora, local, professores) "+
          " VALUES ( "+banca.getIdbanca()+",'"+banca.getData()+"','"+banca.getHora()+"','"+banca.getLocal()+"','"+banca.getProfessores()+"');");
           
    }
    
    public void deletar (Banca banca)
    {
        this.session.execute (
          " DELETE FROM monografia.aluno WHERE matricula="+banca.getIdbanca()+";");     
    
    }
    
    public void alterar (Banca banca)
    {
        this.session.execute (
          " UPDATE monografia.banca SET local='"+banca.getLocal()+"' WHERE idbanca="+banca.getIdbanca()+";");    
    
    }
    
    public void consultar (Banca banca)
    {
        ResultSet results = session.execute("select * from monografia.banca where idbanca="+banca.getIdbanca()+";");
        
        for (Row row : results) 
        {
           System.out.format("id: %d\tdata:%s\thora:%s\tlocal:%s\tprofessores:%s\n", row.getInt("idbanca"), 
           row.getString("data"), row.getString("hora"), row.getString("local"), row.getString("professores"));
        }
    
    }
    
    public void desconectar ()
    {
        conexao.close();
    }
     
    
}
