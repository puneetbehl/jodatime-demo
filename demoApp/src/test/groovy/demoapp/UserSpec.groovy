package demoapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification
import grails.util.Holders
import org.grails.datastore.mapping.model.PersistentEntity
import org.joda.time.LocalDate

class UserSpec extends Specification implements DomainUnitTest<User> {

    void "canary test should run"() {
        expect:
            true == true
    }
	
    void "test joda time property on persistentEntity"() {
		when:
		assert domain.properties != null
        PersistentEntity persistentEntity = Holders.grailsApplication.mappingContext.getPersistentEntity(domain.class.getName())
		
        then: "Joda property found on persistent entity"
        persistentEntity.hasProperty('dateOfBirth', LocalDate) != null
    }
}
