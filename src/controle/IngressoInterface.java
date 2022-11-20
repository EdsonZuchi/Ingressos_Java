package controle;

import modelo.Ingresso;

import java.util.ArrayList;

public interface IngressoInterface {

    public Boolean incluir(Ingresso ingresso);
    public Boolean atualizar(Ingresso ingresso);
    public Boolean excluir(Ingresso ingresso);
    public ArrayList<Ingresso> listaIngresso();

}
