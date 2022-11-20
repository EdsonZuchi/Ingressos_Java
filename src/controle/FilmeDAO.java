package controle;

import modelo.Filme;

import java.util.ArrayList;

public class FilmeDAO implements FilmeInterface{

    ArrayList<Filme> filmes = new ArrayList<Filme>();

    @Override
    public Boolean incluir(Filme filme) {

        String alerta = "";

        if(filme.getNomeFilme().equals("")){
            alerta += "Nome do filme não informado!\n";
        }
        if(filme.getCodFilme() == null){
            alerta += "Codigo do filme não informado!\n";
        }
        if(filme.getDiaFilme() == null){
            alerta += "Dia do filme não informado!\n";
        }
        if(filme.getHoraFilme() == null){
            alerta += "Hora do filme não informada!\n";
        }

        if(alerta.equals("")){
            filmes.add(filme.getCodFilme(), filme);
            return true;
        }else{
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public Boolean atualizar(Filme filme) {

        String alerta = "";

        if(filme.getNomeFilme().equals("")){
            alerta += "Nome do filme não informado!\n";
        }
        if(filme.getCodFilme() == null){
            alerta += "Codigo do filme não informado!\n";
        }
        if(filme.getDiaFilme() == null){
            alerta += "Dia do filme não informado!\n";
        }
        if(filme.getHoraFilme() == null){
            alerta += "Hora do filme não informada!\n";
        }
        if(!filmes.contains(filme.getCodFilme())){
            alerta += "Filme não cadastrado!\n";
        }

        if(alerta.equals("")){
            filmes.set(filme.getCodFilme(), filme);
            return true;
        }else{
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public Boolean deleta(Filme filme) {

        String alerta = "";

        if(!filmes.contains(filme.getCodFilme())){
            alerta += "Filme não cadastrado!\n";
        }

        if(alerta.equals("")){
            filmes.remove(filme.getCodFilme());
            return true;
        }else {
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public ArrayList<Filme> listaFilmes() {
        return filmes;
    }
}
