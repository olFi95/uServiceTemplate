package dobisch.online.uservicetemplate.api

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/library")
class LibraryAPI {
    @GetMapping("/")
    fun hello(): ResponseEntity<String?>? {
        return ResponseEntity("Hello World!", HttpStatus.OK)
    }
}