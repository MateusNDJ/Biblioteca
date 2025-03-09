# Sistema de Gerenciamento de Biblioteca

Este é um projeto de exemplo para um sistema de gerenciamento de biblioteca, desenvolvido em Java. O sistema permite o cadastro de livros e usuários, além de gerenciar empréstimos e devoluções de livros.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- `model`: Contém as classes de modelo (Livro, Usuario, Emprestimo).
- `dao`: Contém as classes de acesso a dados (LivroDAO, UsuarioDAO, EmprestimoDAO).
- `service`: Contém as classes de serviço que implementam a lógica de negócios.
- `ui`: Contém as classes de interface gráfica.

## Funcionalidades

- **Cadastro de Livros**: Permite adicionar novos livros ao sistema.
- **Cadastro de Usuários**: Permite adicionar novos usuários ao sistema.
- **Empréstimos**: Permite registrar o empréstimo de livros para usuários.
- **Devoluções**: Permite registrar a devolução de livros.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Swing**: Biblioteca para criação da interface gráfica.
- **DAO Pattern**: Padrão de projeto para acesso a dados.
- **MVC Pattern**: Padrão de projeto para separação de responsabilidades.

## Como Executar o Projeto

1. **Clone o repositório**:
    ```bash
    git clone https://github.com/seu-usuario/sistema-biblioteca.git
    ```

2. **Importe o projeto no IntelliJ IDEA**:
    - Abra o IntelliJ IDEA.
    - Selecione `File > Open` e escolha o diretório do projeto clonado.

3. **Compile e execute o projeto**:
    - Navegue até a classe `BibliotecaUI` no pacote `ui`.
    - Execute a classe `BibliotecaUI` que contém o método `main`.

## Estrutura das Classes

### Livro.java
```java
package model;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    // Getters e Setters
}
