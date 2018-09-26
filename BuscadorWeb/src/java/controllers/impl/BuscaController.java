package controllers.impl;

import buscador.BancoDaoException;
import buscador.ConexaoException;
import buscador.ConexaoInterface;
import buscador.ConexaoJavaDb;
import buscador.Produto;
import buscador.ProdutoDaoRelacional;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import controllers.AbstractController;
import java.math.BigDecimal;
import buscador.ProdutoDaoInterface;

/**
 *
 * Felipe Macena e Rafael Kacuta
 */
public class BuscaController extends AbstractController {

    public void execute() {
        ConexaoInterface conexao = new ConexaoJavaDb("127.0.0.1", 1527, "app", "app", "banco");
        try {
            ProdutoDaoInterface dao = new ProdutoDaoRelacional(conexao);
            List<Produto> produtos = dao.obterProdutos();
            this.setReturnPage("/buscador.jsp");
            this.getRequest().setAttribute("lista_produtos", produtos);
            conexao.close();
        } catch (ConexaoException ex) {
            System.out.println("Erro de conexão!");
            System.out.println(ex.getMensagem());
        } catch (BancoDaoException ex) {
            System.out.println("Erro ao executar operação na base de dados!");
            System.out.println(ex.getMensagem());
        }
    }
}
