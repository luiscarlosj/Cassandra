/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacoes;

import DAO.AlunoDAO;
import DAO.BancaDAO;
import DAO.CursoDAO;
import DAO.MonografiaDAO;
import DAO.ProfessorDAO;
import Entity.Aluno;
import Entity.Banca;
import Entity.Curso;
import Entity.Monografia;
import Entity.Professor;

/**
 *
 * @author luis carlos
 */
public class Cassandra_Update {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ALTERANDO ALUNO
        /*Aluno aluno = new Aluno();
        AlunoDAO al = new AlunoDAO();       
        
        aluno.setNome("luis");
        aluno.setMatricula(15);
               
        al.alterar(aluno);
        
        al.desconectar();*/
        
        //ALTERANDO PROFESSOR
        /*Professor professor = new Professor();
        ProfessorDAO al = new ProfessorDAO();       
        
        professor.setMatricula_prof(1000);
        professor.setNome_prof("Rafael Fernandes");
        
        al.alterar(professor);
        
        al.desconectar();*/
        
        //ALTERANDO BANCA
        /*Banca banca = new Banca();
        BancaDAO al = new BancaDAO();   
        
        banca.setIdbanca(1);        
        banca.setLocal("Auditorio");       
                
        al.alterar(banca);
        
        al.desconectar();*/
        
        //ALTERANDO CURSO        
        /*Curso curso = new Curso();
        CursoDAO al = new CursoDAO();   
        
        curso.setIdcurso(5);
        curso.setNome("Engenharia Aeronautica");
                       
        al.alterar(curso);
        
        al.desconectar();*/
        
        //ALTERANDO MONOGRAFIA        
        Monografia monografia = new Monografia();
        MonografiaDAO al = new MonografiaDAO();   
        
        monografia.setIdmonografia(1);
        monografia.setTitulo("NoSQL Cassandra");
                       
        al.alterar(monografia);
        
        al.desconectar();
    }
}
