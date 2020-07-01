package at.nacs.apptruistic.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Organization {

  private String id;

  @Email
  @NotNull
  @NotEmpty
  private String email;

  @NotEmpty
  @NotNull
  @Size(max = 16, min = 8, message = "password must be greater than 8 and smaller than 16 characters")
  private String password;


  @NotEmpty
  @NotNull(message = "organization name cannot be empty")
  private String organizationName;

  @NotEmpty
  @NotNull(message = "please enter a short description about the organization")
  private String description;


  private String websiteLink;

  @NotEmpty
  @NotNull
  private String contact;

  private List<Event> events = new ArrayList<>();
  private Set<String> authorities = new HashSet<>();
}
