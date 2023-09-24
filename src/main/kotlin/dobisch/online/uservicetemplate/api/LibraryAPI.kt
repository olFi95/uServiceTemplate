package dobisch.online.uservicetemplate.api

import dobisch.online.uservicetemplate.service.LibraryService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/library")
class LibraryAPI (val libraryService: LibraryService){

    @GetMapping("/")
    fun root(): ResponseEntity<String?>? {
        return ResponseEntity(libraryService.root(), HttpStatus.OK)
    }
}