package controle;

import modelo.Filme;

import java.util.ArrayList;

public interface FilmeInterface {

    public Boolean incluir(Filme filme);
    public Boolean atualizar(Filme filme);
    public Boolean deleta(Filme filme);
    public ArrayList<Filme> listaFilmes();
}
