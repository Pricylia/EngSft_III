import java.io.*;

public abstract class Persistencia {
    protected PersistenciaStrategy persistencia;

    public Persistencia(PersistenciaStrategy persistencia) {
        this.persistencia = persistencia;
    }

    public void salvar(String dados, String arquivo) throws IOException {
        persistencia.salvar(dados, arquivo);
    }
}

interface PersistenciaStrategy {
    void salvar(String dados, String arquivo) throws IOException;
}

public class PersistenciaJSON implements PersistenciaStrategy {
    @Override
    public void salvar(String dados, String arquivo) throws IOException {
        if (!dados.startsWith("{")) {
            throw new IllegalArgumentException("Dados não estão em formato JSON.");
        }
        
        try (FileWriter writer = new FileWriter(arquivo)) {
            writer.write(dados);
        }
    }
}
