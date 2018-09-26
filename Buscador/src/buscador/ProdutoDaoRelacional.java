package buscador;

import buscador.Produto;
import buscador.BancoDaoException;
import buscador.ConexaoInterface;
import buscador.ConexaoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import buscador.ProdutoDaoInterface;

public class ProdutoDaoRelacional implements ProdutoDaoInterface {

    private PreparedStatement stmObterProdutos;

    public ProdutoDaoRelacional(ConexaoInterface conexao) throws ConexaoException, BancoDaoException {
        Connection connection = conexao.getConnection();
        String sql = "";
        try {
            sql = "select * \n"
                    + "from produto pr\n"
                    + "inner join loja lj\n"
                    + "on(pr.codprod = lj.codloja)\n"
                    + "where(pr.nomeprod like '%?%');";
            stmObterProdutos = connection.prepareStatement(sql);
        } catch (SQLException ex) {
            throw new BancoDaoException("Erro ao preparar sentença SQL: " + sql);
        }
    }

    @Override
    public List<Produto> obterProdutos() throws BancoDaoException {
        List<Produto> produtos = new ArrayList<>();
        try {
            ResultSet resultados = stmObterProdutos.executeQuery();
            while (resultados.next()) {
                Produto p = new Produto(resultados.getInt("codprod"),
                        resultados.getString("nomeprod"),
                        resultados.getLong("preco"),
                        resultados.getString("descricao")
                );
                produtos.add(p);
            }
        } catch (SQLException ex) {
            throw new BancoDaoException("Erro ao executar consulta de todas as contas");
        }
        return produtos;
    }
}
