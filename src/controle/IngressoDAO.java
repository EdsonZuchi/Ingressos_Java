package controle;

import modelo.Ingresso;

import java.util.ArrayList;

public class IngressoDAO implements IngressoInterface{

    ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();

    @Override
    public Boolean incluir(Ingresso ingresso) {

        String alerta = "";

        //Validações

        if(alerta.equals("")){
            ingressos.add(ingresso.getCodIngresso(), ingresso);
            return true;
        }else{
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public Boolean atualizar(Ingresso ingresso) {
        String alerta = "";

        //Validações

        if(alerta.equals("")){
            ingressos.set(ingresso.getCodIngresso(), ingresso);
            return true;
        }else{
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public Boolean excluir(Ingresso ingresso) {
        String alerta = "";

        //Validações

        if(alerta.equals("")){
            ingressos.remove(ingresso.getCodIngresso());
            return true;
        }else{
            System.out.println(alerta);
            return false;
        }
    }

    @Override
    public ArrayList<Ingresso> listaIngresso() {
        return ingressos;
    }
}
