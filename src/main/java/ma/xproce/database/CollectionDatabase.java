package ma.xproce.database;

import lombok.Getter;
import lombok.Setter;
import ma.xproce.dao.Etudiant;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class CollectionDatabase implements DatabaseFacade {

    private List<Etudiant> etudiantDatabase;

    @Override
    public List<Etudiant> databaseLayer() {
        etudiantDatabase = new ArrayList<Etudiant>();
        return etudiantDatabase;
    }


}
