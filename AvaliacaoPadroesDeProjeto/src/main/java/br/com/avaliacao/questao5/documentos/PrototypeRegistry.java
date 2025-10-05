package main.java.br.com.avaliacao.questao5.documentos;

import java.util.HashMap;
import java.util.Map;

/**
 * Registro Singleton que armazena e fornece clones dos modelos de documentos.
 */
public class PrototypeRegistry {

    private static PrototypeRegistry instance;
    private final Map<String, DocumentPrototype> prototypes = new HashMap<>();

    private PrototypeRegistry() {
    }

    public static PrototypeRegistry getInstance() {
        if (instance == null) {
            instance = new PrototypeRegistry();
        }
        return instance;
    }

    public void registerPrototype(String key, DocumentPrototype prototype) {
        prototypes.put(key, prototype);
    }

    public DocumentPrototype createFromPrototype(String key) {
        DocumentPrototype prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("Protótipo não encontrado: " + key);
        }
        return prototype.clone();
    }

    public void listarModelos() {
        System.out.println("Modelos disponíveis no registro:");
        for (String key : prototypes.keySet()) {
            System.out.println("- " + key);
        }
    }
}