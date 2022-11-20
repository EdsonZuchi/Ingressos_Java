package controle;

import modelo.Sessao;

import java.util.ArrayList;

public class SessaoDAO implements SessaoInterface{

    ArrayList<Sessao> sessoes = new ArrayList<Sessao>();

    @Override
    public Boolean incluir(Sessao sessao) {

        String alerta = "";

        //Validações

        if(alerta.equals("")){
            sessoes.add(sessao.getCodSessao(), sessao);
            return true;
        }else{
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public Boolean atualizar(Sessao sessao) {
        String alerta = "";

        //Validações

        if(alerta.equals("")){
            sessoes.set(sessao.getCodSessao(), sessao);
            return true;
        }else{
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public Boolean excluir(Sessao sessao) {
        String alerta = "";

        //Validações

        if(alerta.equals("")){
            sessoes.remove(sessao.getCodSessao());
            return true;
        }else{
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public ArrayList<Sessao> listaSessao() {
        return sessoes;
    }
}
