package dobisch.online.uservicetemplate.repository

import dobisch.online.uservicetemplate.data.Library
import org.springframework.data.repository.CrudRepository


interface LibraryRepository: CrudRepository<Library, Long> {

}