package dobisch.online.uservicetemplate.api

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get


@WebMvcTest(LibraryAPI::class)
class LibraryAPITest{

    @Autowired
    private lateinit var mockMvc: MockMvc

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