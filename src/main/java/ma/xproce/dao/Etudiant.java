package ma.xproce.dao;

import lombok.*;

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
