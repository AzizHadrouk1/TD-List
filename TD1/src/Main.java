//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Test du constructeur sans paramètres et des setters
        Etudiant etudiant1 = new Etudiant();
        etudiant1.setId(1);
        etudiant1.setNom("Dupont");
        etudiant1.setPrenom("Jean");

        // Test du constructeur avec paramètres
        Etudiant etudiant2 = new Etudiant("aziz", "Durand", 55);

        // Affichage des étudiants
        System.out.println("Étudiant 1 : " + etudiant1);
        System.out.println("Étudiant 2 : " + etudiant2);

        // Test des getters
        System.out.println("Nom de l'étudiant 1 : " + etudiant1.getNom());
        System.out.println("Prénom de l'étudiant 2 : " + etudiant2.getPrenom());

        // Test de la méthode equals
        Etudiant etudiant3 = new Etudiant("1", "Martin", 44); // même id que etudiant1
        System.out.println("Étudiant 1 est-il égal à étudiant 3 ? " + etudiant1.equals(etudiant3));

        // Test de la méthode toString
        System.out.println("Représentation de l'étudiant 2 : " + etudiant2.toString());

    }
}