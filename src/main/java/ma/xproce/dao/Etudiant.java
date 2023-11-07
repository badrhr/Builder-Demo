package ma.xproce.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Sstter;
import lombok.NoArgsConstructor;
import lambok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Etudiant {
    private Long id;
    private String name;
    private String email;
    private String password;
}
