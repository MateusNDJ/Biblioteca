package DAO;

import model.Livro;
import java.util.ArrayList;
import java.util.List;

public class LivroDAO {
    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> listarLivros() {
        return livros;
    }

    // Outros métodos de CRUD
}