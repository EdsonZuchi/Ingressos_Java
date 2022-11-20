package modelo;

import java.time.*;

public class Filme {

    private Integer codFilme;
    private String nomeFilme;
    private LocalDate diaFilme;
    private LocalTime horaFilme;

    public Filme(Integer codFilme, String nomeFilme, LocalDate diaFilme, LocalTime horaFilme) {
        this.codFilme = codFilme;
        this.nomeFilme = nomeFilme;
        this.diaFilme = diaFilme;
        this.horaFilme = horaFilme;
    }

    public Integer getCodFilme() {
        return codFilme;
    }

    public void setCodFilme(Integer codFilme) {
        this.codFilme = codFilme;
    }

    public Filme() {
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public LocalDate getDiaFilme() {
        return diaFilme;
    }

    public void setDiaFilme(LocalDate diaFilme) {
        this.diaFilme = diaFilme;
    }

    public LocalTime getHoraFilme() {
        return horaFilme;
    }

    public void setHoraFilme(LocalTime horaFilme) {
        this.horaFilme = horaFilme;
    }

}
