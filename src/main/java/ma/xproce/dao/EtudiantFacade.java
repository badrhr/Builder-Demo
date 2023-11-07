package ma.xproce.dao;

import java.util.List;

public interface EtudiantFacade {
    public Etudiant save(Etudiant etudiant);

    public Etudiant update(Etudiant etudiant);

    public Etudiant delete(Etudiant etudiant);

    public List<Etudiant> findAll();

    public Etudiant findById(Long id);

    public Etudiant findByEmail(String email);

}
