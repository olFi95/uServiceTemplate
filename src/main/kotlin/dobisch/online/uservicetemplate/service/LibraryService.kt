package dobisch.online.uservicetemplate.service

import dobisch.online.uservicetemplate.data.Library
import dobisch.online.uservicetemplate.repository.LibraryRepository
import org.springframework.stereotype.Service

@Service
class LibraryService(val libraryRepository: LibraryRepository){
    fun root(): String {
        return "Hello World!"
    }

    fun saveLibrary(library: Library): Library {
        return libraryRepository.save(library)
    }
}
