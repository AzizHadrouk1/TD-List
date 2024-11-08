public interface University {
    // Ajoute un étudiant à l'université
    void ajouterEtudiant(Etudiant e);

    // Recherche un étudiant par objet Etudiant
    boolean rechercherEtudiant(Etudiant e);

    // Recherche un étudiant par nom
    boolean rechercherEtudiant(String nom);

    // Supprime un étudiant de l'université
    void supprimerEtudiant(Etudiant e);

    // Affiche tous les étudiants de l'université
    void displayEtudiants();

    // Trie les étudiants par leur identifiant
    void trierEtudiantsParId();

    // Trie les étudiants par leur nom
    void trierEtudiantsParNom();
}
