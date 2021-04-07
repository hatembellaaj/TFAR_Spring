package tn.mdweb.dsi.tfar;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("tn.mdweb.dsi.tfar");

        noClasses()
            .that()
            .resideInAnyPackage("tn.mdweb.dsi.tfar.service..")
            .or()
            .resideInAnyPackage("tn.mdweb.dsi.tfar.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..tn.mdweb.dsi.tfar.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
