package at.nacs.apptruistic.logic;

import at.nacs.apptruistic.domain.Organization;
import at.nacs.apptruistic.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrganizationManager {

  private final OrganizationRepository organizationRepository;
  PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

  public Organization store(Organization organization) {

    organization.setPassword(passwordEncoder.encode(organization.getPassword()));
    return organizationRepository.save(organization);
  }

  public Optional<Organization> findByEmail(String email) {
    return organizationRepository.findByEmail(email);
  }
}
