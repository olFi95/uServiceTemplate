package dobisch.online.uservicetemplate.api

import com.ninjasquad.springmockk.MockkBean
import dobisch.online.uservicetemplate.service.LibraryService
import io.mockk.every
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get


@WebMvcTest(LibraryAPI::class)
class LibraryAPITest{

    @MockkBean
    private lateinit var libraryService: LibraryService

    @Autowired
    private lateinit var mockMvc: MockMvc

    @BeforeEach
    fun init(){
        every { libraryService.root() } returns "Hello World!"
    }
    @Test
    fun root_gives_right_response() {
        mockMvc.get("/api/library/")
                .andExpect {
            status { isOk() }
            content {
                contentTypeCompatibleWith("text/plain")
                string("Hello World!")
            }
        }
    }
}