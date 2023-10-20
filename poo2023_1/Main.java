package br.edu.idp.disciplinas.poo2023_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws SQLException {
        // 2. Estabelecer uma conexão entre a aplicação cliente e servidor do banco de dados;
        String paramsConexao = "jdbc:h2:mem:testdb";
        String usuario = "";
        String senha = "";
        Connection conexao = DriverManager.getConnection(paramsConexao, usuario, senha);

        // 3. Montar e executar a consulta SQL desejada;package br.edu.idp.disciplinas.poo2023_1;
        String criacaoSql = "create table pessoa (id int primary key, nome varchar(150), qtdAcesso int, naturalidade varchar(75) )";
        Statement stmtC = conexao.createStatement();
        stmtC.executeUpdate(criacaoSql);
        stmtC.close();

        String addPessoaSQL = "INSERT INTO pessoa (id, nome, qtdAcesso, naturalidade) VALUES (1, 'Rocha', 5, 'SUDAO')";
        Statement stmtInsert = conexao.createStatement();
        stmtInsert.executeUpdate(addPessoaSQL);
        stmtInsert.close();

        String consulta = "select * from pessoa";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(consulta);

        List<Pessoa> pessoas = new ArrayList<>();

        // 4. Processar no cliente o resultado da consulta.
        while (resultado.next()) {
            String nome = resultado.getString("nome");
            Integer quantidade = resultado.getInt("qtdAcesso");
            String naturalidade = resultado.getString("naturalidade");

            Pessoa pessoa = new Pessoa();
            pessoa.setNome(nome);
            pessoa.setQuantidadeAcesso(quantidade);
            pessoa.setNaturalidade(naturalidade);
            pessoas.add(pessoa);
        }

        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Quantidade de Acessos: " + pessoa.getQuantidadeAcesso());
            System.out.println("Naturalidade: " + pessoa.getNaturalidade());
            System.out.println();
        }

        System.out.println("\nTchau, até a próxima\n\n\t\t:-)");
    }
}

