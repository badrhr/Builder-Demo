package ma.xproce.dao;

import lombok.Getter;
import lombok.Setter;
import ma.xproce.database.DatabaseFacade;

import java.util.List;


public class EtudiantDAO implements EtudiantFacade {


    private DatabaseFacade database;

    private List<Etudiant> etudiants;

    public EtudiantDAO(DatabaseFacade databaseFacade) {
        this.database = databaseFacade;
        this.etudiants = (List<Etudiant>) database.databaseLayer();
        //etudiants.add(Etudiant.builder().name("Badr").email("badr@gmail.com").build());
    }

    @Override
    public Etudiant save(Etudiant etudiant) {
        try {
            etudiants.add(etudiant);
            return etudiant;
        } catch (Exception ex) {
            return null;
        }
    }

    @Override
    public Etudiant update(Etudiant etudiant) {
        return null;
    }

    @Override
    public Etudiant delete(Etudiant etudiant) {
        return null;
    }

    @Override
    public List<Etudiant> findAll() {
        return etudiants;
    }

    @Override
    public Etudiant findById(Long id) {
        return null;
    }

    @Override
    public Etudiant findByEmail(String email) {
        Etudiant etudiantResult = null;
        for (Etudiant etudiant : etudiants) {
            if (etudiant.getEmail() == email) {
                return etudiant;

            }
        }
        return etudiantResult;
    }
}
