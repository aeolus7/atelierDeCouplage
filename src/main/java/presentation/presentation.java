package presentation;
import dao.Etudiant;
import dao.EtudiantDao;
import metier.EtudiantManager;

public class presentation {
    public static void main(String[] args) {
        // Créer un EtudiantDAO
        EtudiantDao etudiantDao = new EtudiantDao();

        // Créer un EtudiantManager en lui passant l'EtudiantDAO
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDao);

        // Ajouter des étudiants
        Etudiant etudiant1 = new Etudiant(1, "Nom1", "Prenom1", "email1@example.com");
        Etudiant etudiant2 = new Etudiant(2, "Nom2", "Prenom2", "email2@example.com");
        Etudiant etudiant3 = new Etudiant(3, "Nom3", "Prenom3", "email3@example.com");
        Etudiant etudiant4 = new Etudiant(4, "Nom4", "Prenom4", "email4@example.com");

        etudiantManager.addEtudiant(etudiant1);
        etudiantManager.addEtudiant(etudiant2);
        etudiantManager.addEtudiant(etudiant3);
        etudiantManager.addEtudiant(etudiant4);

        // Tester getAllEtudiants()
        System.out.println("Liste des étudiants :");
        for (Etudiant etudiant : etudiantManager.getEtudiant()) {
            System.out.println("ID: " + etudiant.getId() + ", Nom: " + etudiant.getNom() +
                    ", Prénom: " + etudiant.getPrenom() + ", Email: " + etudiant.getEmail());
        }
    }
}
