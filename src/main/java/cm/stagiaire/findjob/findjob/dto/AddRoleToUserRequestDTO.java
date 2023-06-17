package cm.stagiaire.findjob.findjob.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddRoleToUserRequestDTO {
    private String userEmail;
    private String roleName;
}
