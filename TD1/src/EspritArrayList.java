import java.util.ArrayList;

public class EspritArrayList implements University {
    private ArrayList<Etudiant> etudiants;

    public EspritArrayList() {
        etudiants = new ArrayList<>();
    }

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        etudiants.sort((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));
    }

    @Override
    public void trierEtudiantsParNom() {
        etudiants.sort((e1, e2) -> e1.getNom().compareToIgnoreCase(e2.getNom()));
    }
}
