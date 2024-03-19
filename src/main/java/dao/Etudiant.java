package dao;

public class Etudiant
{ private int id;
    private String nom;
    private String prenom;
    private String email;
    public Etudiant(int id,String nom,String prenom,String email){
      this.id=id;
      this.nom=nom;
      this.prenom=prenom;
      this.email=email;
    }
    public String getEmail(){
    return this.email;
    }
    public String getNom(){
        return this.nom;
}
public String getPrenom(){
        return this.prenom;
}
public int getId(){
        return this.id;
}
}


