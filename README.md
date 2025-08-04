# 📚 ERP Biblioteca Virtual — por Pedro Henrique Ceciliano

Este projeto é um **Sistema de Biblioteca Virtual** desenvolvido em Java, com o objetivo de simular as principais funcionalidades de uma biblioteca moderna. O sistema permite **empréstimos**, **fila de espera**, **histórico de navegação** e um recurso inteligente de **recomendação de livros** baseado em **algoritmos de grafos**.

---

## 🚀 Sobre o Projeto

Este ERP (Enterprise Resource Planning) foi pensado para simular a gestão completa de uma biblioteca virtual, atendendo às principais necessidades de leitores e administradores. O foco está em aplicar conceitos de orientação a objetos, estruturas de dados e algoritmos de grafos para resolver problemas reais de recomendação e organização.

---

## 🧰 Tecnologias Utilizadas

- **Java (JDK 17+)**
- Programação Orientada a Objetos (POO)
- Estruturas de dados: `Map`, `List`, `Queue`, `Graph`
- Algoritmo de Dijkstra para recomendação
- Simulação de histórico e interação com o usuário

---

## 📁 Estrutura do Código

| Arquivo | Descrição |
|--------|-----------|
| `Livro.java` | Representa um livro, contendo atributos como título, autor, gênero e ISBN. |
| `Biblioteca.java` | Gerencia os livros disponíveis e os empréstimos realizados. |
| `ListaEspera.java` | Implementa a fila de espera para livros emprestados. |
| `HistoricoNavegacao.java` | Registra as interações do usuário com os livros. |
| `RecomendacaoLivros.java` | Utiliza um grafo para recomendar livros similares com base na menor distância entre nós (livros). |
| `BibliotecaVirtual.java` | Classe principal que simula o uso da biblioteca e interage com as outras classes. |

---

## 🎯 Funcionalidades

### 📚 Gerenciamento de Livros
- Cadastro de livros com seus respectivos dados.
- Busca e listagem por título, autor ou gênero.

### 🤝 Empréstimo e Devolução
- Usuários podem emprestar livros se disponíveis.
- Em caso de indisponibilidade, entram automaticamente na fila de espera.

### 🕵️ Histórico de Navegação
- Armazena os livros visualizados ou emprestados pelo usuário.
- Pode ser utilizado para personalizar recomendações.

### 🧠 Recomendação Inteligente
- Sistema de recomendação com base na similaridade entre livros.
- Utiliza grafos ponderados e o **algoritmo de Dijkstra** para sugerir os livros mais próximos em termos de gênero/temática.

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/phdceciliano/ERP-Biblioteca
   
Compile os arquivos: javac *.java
Execute a aplicação: java BibliotecaVirtual

💡 Exemplo de Código
Livro livro1 = new Livro("1984", "George Orwell", "Distopia", "001");
Livro livro2 = new Livro("Admirável Mundo Novo", "Aldous Huxley", "Distopia", "002");

Biblioteca biblioteca = new Biblioteca();
biblioteca.adicionarLivro(livro1);
biblioteca.adicionarLivro(livro2);

RecomendacaoLivros recomendador = new RecomendacaoLivros();
recomendador.adicionarSimilaridade(livro1, livro2, 1.5);

List<Livro> recomendados = recomendador.recomendarLivros(livro1);

📌## Conclusão

Este projeto foi desenvolvido por Pedro Henrique Ceciliano, junto ao time de desenvolvimento PUCPR como parte dos estudos em Análise e Desenvolvimento de Sistemas e tem como objetivo explorar conceitos avançados de programação, algoritmos e ordenação e estrutura de dados.

🔗 Contato
GitHub: phdceciliano
LinkedIn: Pedro Henrique Ceciliano
