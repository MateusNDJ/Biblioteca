package Service;

import DAO.LivroDAO;
import DAO.UsuarioDAO;
import DAO.EmprestimoDAO;
import model.Livro;
import model.Usuario;
import model.Emprestimo;

import java.util.Date;

public class BibliotecaService {
    private LivroDAO livroDAO = new LivroDAO();
    private UsuarioDAO usuarioDAO = new UsuarioDAO();
    private EmprestimoDAO emprestimoDAO = new EmprestimoDAO();

    public void cadastrarLivro(Livro livro) {
        livroDAO.adicionarLivro(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarioDAO.adicionarUsuario(usuario);
    }

    public void realizarEmprestimo(Livro livro, Usuario usuario) {
        if (livro.isDisponivel()) {
            Emprestimo emprestimo = new Emprestimo(livro, usuario, new Date(), null);
            emprestimoDAO.adicionarEmprestimo(emprestimo);
            livro.setDisponivel(false);
        }
    }

    public void devolverLivro(Emprestimo emprestimo) {
        emprestimo.setDataDevolucao(new Date());
        emprestimo.getLivro().setDisponivel(true);
    }

    // Outros métodos de serviço
}