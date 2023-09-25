package dobisch.online.uservicetemplate.api

import dobisch.online.uservicetemplate.service.LibraryService
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/library")
class LibraryAPI(val libraryService: LibraryService) {

    @GetMapping("/")
    fun root(): ResponseEntity<String> {
        val headers = HttpHeaders()
        headers.add(HttpHeaders.CONTENT_TYPE, "text/plain")
        return ResponseEntity(libraryService.root(), headers, HttpStatus.OK)
    }
}