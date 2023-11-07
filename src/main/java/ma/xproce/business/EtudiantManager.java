package ma.xproce.business;

import lombok.Getter;
import lombok.Setter;
import ma.xproce.dao.Etudiant;
import ma.xproce.dao.EtudiantFacade;

import java.util.List;

public class EtudiantManager implements EtudiantManagerFacade {

    private EtudiantFacade etudiantFacade;
    public EtudiantManager(EtudiantFacade etudiantFacade){
        this.etudiantFacade = etudiantFacade;
    }
    @Override
    public Etudiant checkMail(String email) {
        return etudiantFacade.findByEmail(email);
    }

    @Override
    public Etudiant save(Etudiant etudiant) {
        Etudiant etudiantIsThere = checkMail(etudiant.getEmail());
        if (etudiantIsThere == null) {
            etudiantFacade.save(etudiant);
        }
        return etudiantIsThere;
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
    public List<Etudiant> getAll() {
        return  etudiantFacade.findAll();
    }

    @Override
    public Etudiant getById(Long id) {
        return null;
    }

    @Override
    public Etudiant getByEmail(String email) {
        return null;
    }
}
