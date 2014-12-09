/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacoes;

import DAO.AlunoDAO;
import DAO.MonografiaDAO;
import DAO.ProfessorDAO;
import Entity.Aluno;
import Entity.Monografia;
import Entity.Professor;
import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

/**
 *
 * @author luis carlos
 */
public class Cassandra_Delete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DELETANDO ALUNO
        /*Aluno aluno = new Aluno();
        AlunoDAO al = new AlunoDAO();       
        
        aluno.setMatricula(10);
        
        al.deletar(aluno);
        
        al.desconectar();*/
        
        //DELETANDO PROFESSOR
        /*Professor professor = new Professor();
        ProfessorDAO al = new ProfessorDAO();       
        
        professor.setMatricula_prof(10);
        
        al.deletar(professor);
        
        al.desconectar();*/
        
        //DELETANDO BANCA
        /*Banca banca = new Banca();
        BancaDAO al = new BancaDAO();   
        
        banca.setIdbanca(1);
                      
        al.deletar(banca);
        
        al.desconectar();*/
        
        //DELETANDO CURSO        
        /*Curso curso = new Curso();
        CursoDAO al = new CursoDAO();   
        
        curso.setIdcurso(5);
                       
        al.deletar(curso);
        
        al.desconectar();*/
        
        //DELETANDO MONOGRAFIA        
        /*Monografia monografia = new Monografia();
        MonografiaDAO al = new MonografiaDAO();   
        
        monografia.setIdmonografia(1);
        
        al.deletar(monografia);
        
        al.desconectar();*/
    }
}
