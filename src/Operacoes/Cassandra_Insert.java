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
public class Cassandra_Insert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        //INSERINDO ALUNO
        Aluno aluno = new Aluno();
        AlunoDAO al = new AlunoDAO();       
        
        aluno.setNome("marcio");
        aluno.setMatricula(15);
        aluno.setCurso_idcurso(2);
        
        al.adicionar(aluno);
        
        al.desconectar();
        
        //INSERINDO PROFESSOR
        /*Professor professor = new Professor();
        ProfessorDAO al = new ProfessorDAO();       
        
        professor.setMatricula_prof(1000);
        professor.setCurso_idcurso(1);
        professor.setNome_prof("Carla Faria");
        
        al.adicionar(professor);
        
        al.desconectar();*/
        
        //INSERINDO BANCA
        /*Banca banca = new Banca();
        BancaDAO al = new BancaDAO();   
        
        banca.setIdbanca(1);
        banca.setData("01-01-2014");
        banca.setHora("09:30");        
        banca.setLocal("Laboratorio 27");
        banca.setProfessores("Rafael, Carla Faria, Josenildo");        
                
        al.adicionar(banca);
        
        al.desconectar();*/
        
        //INSERINDO CURSO        
        /*Curso curso = new Curso();
        CursoDAO al = new CursoDAO();   
        
        curso.setIdcurso(5);
        curso.setNome("Quimica");
                       
        al.adicionar(curso);
        
        al.desconectar();*/
        
        //INSERINDO MONOGRAFIA        
        /*Monografia monografia = new Monografia();
        MonografiaDAO al = new MonografiaDAO();   
        
        monografia.setIdmonografia(1);
        monografia.setAluno_matricula(1);
        monografia.setBanca_idbanca(1);       
        monografia.setNota((float) 10.0);
        monografia.setTitulo("Banco de Dados NoSQL Cassandra");
                       
        al.adicionar(monografia);
        
        al.desconectar();*/
        
        
        
        
    }
}
