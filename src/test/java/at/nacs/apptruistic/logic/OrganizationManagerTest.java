package at.nacs.apptruistic.logic;

import at.nacs.apptruistic.domain.Organization;
import at.nacs.apptruistic.repository.OrganizationRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
class OrganizationManagerTest {
  @Autowired
  List<Organization> organizations;

  //Organization organization;

  @Autowired
  OrganizationManager manager;

  @Autowired
  OrganizationRepository repository;

  @BeforeEach
  void before() {
    repository.deleteAll();
//    organization = Organization.builder()
//                                     .email("tamara@hotmail.com")
//                                     .password("12345678")
//                                     .organizationName("fighting")
//                                     .description("charity")
//                                     .websiteLink("www.tamara.com")
//                                     .contact("0968888888")
//                                     .build();
  }

  @AfterEach
  void after() {
    repository.deleteAll();
  }

//  @Test
//  void store() throws EmailExistsException {
//    Organization organization1 = organizations.get(0);
//    Organization actual = manager.store(organization1);
//
//    assertThat(actual).isNotNull();
//    assertThat(actual.getId()).isNotNull();
//    assertThat(actual.getEmail()).isEqualTo("tamara@hotmail.com");
//    assertThat(actual.getWebsiteLink()).isEqualTo("www.tamara.com");
//
//  }
}