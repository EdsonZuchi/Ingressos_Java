package controle;

import modelo.Sessao;

import java.util.ArrayList;

public interface SessaoInterface {

    public Boolean incluir(Sessao sessao);
    public Boolean atualizar(Sessao sessao);
    public Boolean excluir(Sessao sessao);
    public ArrayList<Sessao> listaSessao();

}
