public class Tarefa {
    private String titulo;
    private String status;

    public Tarefa(String titulo) {
        this.titulo = titulo;
        this.status = "A Fazer";
    }

    public void avancarStatus() {
        if (status.equals("A Fazer")) {
            status = "Em Progresso";
        } else if (status.equals("Em Progresso")) {
            status = "Concluído";
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return titulo + " [" + status + "]";
    }
}
