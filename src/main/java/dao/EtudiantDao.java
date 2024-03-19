package dao;

import java.util.ArrayList;
import java.util.List;

public class EtudiantDao {
private List<Etudiant> etudiants;
public EtudiantDao(){
    etudiants=new ArrayList<>();
}
public Etudiant addEtudiant(Etudiant etudiant){
    etudiants.add(etudiant);
    return etudiant;
}

    public List<Etudiant> getAllEtudiants() {
        return etudiants;
    }
    }


