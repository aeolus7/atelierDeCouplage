package metier;

import dao.Etudiant;
import dao.EtudiantDao;
import java.util.List;

public class EtudiantManager {
    private EtudiantDao etudiantDao;
    public EtudiantManager(EtudiantDao etudiantDao){
        this.etudiantDao=etudiantDao;
    }
    public Etudiant addEtudiant(Etudiant etudiant){
        for(Etudiant existingEtudiant:etudiantDao.getAllEtudiants()){
            if(existingEtudiant.getEmail().equals(etudiant.getEmail())){
                return null;
            }

        }
        return etudiantDao.addEtudiant(etudiant);
        }
public List<Etudiant>getEtudiant ()
        {
        return etudiantDao.getAllEtudiants();

    }
    }

