public class ExemploPersistencia {
    public static void main(String[] args) {
        // Criando uma instância de PersistenciaJSON
        Persistencia persistenciaJSON = new Persistencia(new PersistenciaJSON());

        // Dados em formato JSON
        String dadosJSON = "{ \"nome\": \"João\", \"idade\": 30 }";

        // Tentando salvar os dados usando a persistência JSON
        try {
            persistenciaJSON.salvar(dadosJSON, "arquivo.json");
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }

        // Tentando salvar dados não em formato JSON
        try {
            persistenciaJSON.salvar("Texto simples", "arquivo.txt");
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
    }
}
