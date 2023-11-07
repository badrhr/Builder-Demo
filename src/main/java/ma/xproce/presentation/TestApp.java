package ma.xproce.presentation;

import ma.xproce.business.EtudiantManager;
import ma.xproce.business.EtudiantManagerFacade;
import ma.xproce.dao.Etudiant;
import ma.xproce.dao.EtudiantDAO;
import ma.xproce.dao.EtudiantFacade;
import ma.xproce.database.CollectionDatabase;
import ma.xproce.database.DatabaseFacade;

public class TestApp {

    public TestApp() {
        CollectionDatabase databaseFacade = new CollectionDatabase();
        EtudiantDAO etudiantFacade = new EtudiantDAO(databaseFacade);
        EtudiantManager etudiantManagerFacade = new EtudiantManager(etudiantFacade);


        Etudiant etudiant1 = Etudiant.builder().id(1L).name("x").email("x@gmail.com").build();
        Etudiant etudiant2 = Etudiant.builder().id(2L).name("b").email("b@gmail.com").build();
        Etudiant etudiant3 = Etudiant.builder().id(3L).name("i").email("x@gmail.com").build();


        Etudiant etudiantchacked1 = etudiantManagerFacade.save(etudiant1);
        if (etudiantchacked1 != null) {
            System.out.println(etudiantchacked1 + " has been added successfully");
        } else {
            System.out.println("The email already exists !! Try an other email");
        }
        Etudiant etudiantchacked2 = etudiantManagerFacade.save(etudiant2);
        if (etudiantchacked2 != null) {
            System.out.println(etudiantchacked2 + "has been added successfully");
        } else {
            System.out.println("The email already exists !! Try an other email");
        }
        Etudiant etudiantchacked3 = etudiantManagerFacade.save(etudiant3);
        if (etudiantchacked3 != null) {
            System.out.println(etudiantchacked3 + "has been added successfully");
        } else {
            System.out.println("The email already exists !! Try an other email");
        }

        System.out.println(etudiantManagerFacade.getAll());
    }

    public static void main(String[] args) {
        new TestApp();
    }
}
