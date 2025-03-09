package DAO;

import model.Emprestimo;
import java.util.ArrayList;
import java.util.List;

public class EmprestimoDAO {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public List<Emprestimo> listarEmprestimos() {
        return emprestimos;
    }

    // Outros métodos de CRUD
}