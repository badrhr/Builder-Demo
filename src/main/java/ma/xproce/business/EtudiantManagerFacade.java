package ma.xproce.business;

import ma.xproce.dao.Etudiant;

import java.util.List;

public interface EtudiantManagerFacade {
    public Etudiant checkMail(String email);

    public Etudiant save(Etudiant etudiant);

    public Etudiant update(Etudiant etudiant);

    public Etudiant delete(Etudiant etudiant);

    public List<Etudiant> getAll();

    public Etudiant getById(Long id);

    public Etudiant getByEmail(String email);
}