package buscador;

import buscador.BancoDaoException;
import buscador.Produto;
import java.util.List;

public interface ProdutoDaoInterface {
    List<Produto> obterProdutos() throws BancoDaoException;
}