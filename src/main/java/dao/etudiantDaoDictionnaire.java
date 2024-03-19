package dao;

import java.util.HashMap;
import java.util.Map;

public class etudiantDaoDictionnaire {
    private Map<Integer, Etudiant> etudiantsMap;

    public etudiantDaoDictionnaire() {
        etudiantsMap = new HashMap<>();
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        etudiantsMap.put(etudiant.getId(), etudiant);
        return etudiant;
    }

    public Etudiant getEtudiantById(int id) {
        return etudiantsMap.get(id);
    }

    public Map<Integer, Etudiant> getAllEtudiants() {
        return etudiantsMap;
    }
}
