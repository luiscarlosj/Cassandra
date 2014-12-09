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
public class Cassandra_Consultar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //CONSULTANDO ALUNO
        /*Aluno aluno = new Aluno();
        AlunoDAO al = new AlunoDAO();       
        
        aluno.setMatricula(15);
        
        al.consultar(aluno);
        
        al.desconectar();*/
        
        //CONSULTANDO PROFESSOR
        /*Professor professor = new Professor();
        ProfessorDAO al = new ProfessorDAO();       
        
        professor.setMatricula_prof(1000);
        
        al.consultar(professor);
        
        al.desconectar();*/
        
        //CONSULTANDO BANCA
        /*Banca banca = new Banca();
        BancaDAO al = new BancaDAO();   
        
        banca.setIdbanca(1);
                      
        al.consultar(banca);
        
        al.desconectar();*/
        
        //CONSULTANDO CURSO        
        /*Curso curso = new Curso();
        CursoDAO al = new CursoDAO();   
        
        curso.setIdcurso(5);
                       
        al.consultar(curso);
        
        al.desconectar();*/
        
        //CONSULTANDO MONOGRAFIA        
        Monografia monografia = new Monografia();
        MonografiaDAO al = new MonografiaDAO();   
        
        monografia.setIdmonografia(1);
        
        al.consultar(monografia);
        
        al.desconectar();
    }
}
