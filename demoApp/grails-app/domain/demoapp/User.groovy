package demoapp

import org.joda.time.LocalDate
import org.jadira.usertype.dateandtime.joda.PersistentDateTime

class User {

	LocalDate dateOfBirth

    static constraints = {
		dateOfBirth type: PersistentDateTime
    }
}
