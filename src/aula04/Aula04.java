/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




/**
 *
 * @author Aluno
 */
public class Aula04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Maria", 31);
        Aluno a2 = new Aluno("Maria", 31);
        Aluno a3 = new Aluno("Maria", 31);
        
        List<Aluno> listaAluno = new ArrayList<>();
//        listaAluno.add(a1);
//        listaAluno.add(a2);
//        listaAluno.add(a3);

//        listaAluno.addAll(Arrays.asList(
//                new Aluno("Maria", 31),
//                new Aluno("Joana", 50),
//                new Aluno("Jessica", 40)));
//        
//        for (Aluno aluno : listaAluno) {
//            
//            System.out.println(aluno.getNome() + "\n" + aluno.getIdade());
//            
//        }
        
        Set<Aluno> listaAlunoSet = new HashSet<>();
        listaAlunoSet.add(a1);
        listaAlunoSet.add(a2);
        listaAlunoSet.add(a3);
        
        for (Aluno listaAlunoSet1 : listaAlunoSet) {
        
            System.out.println(listaAlunoSet1.getNome() + "\n" + 
                    listaAlunoSet1.getIdade());
        }
    }
    
}
