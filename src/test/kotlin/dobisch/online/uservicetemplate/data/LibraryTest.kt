package dobisch.online.uservicetemplate.data

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LibraryTest {

    @Test
    fun getNumberOfBooks_in_Bookshelf() {
        val bookshelf = Bookshelf(0, listOf(
                Book(0, "Hallo Welt", "12345678912"),
                Book(1, "Hello World", "21987654321")
        ))
        assertEquals(2, bookshelf.getNumberOfBooks())
    }

    @Test
    fun getNumberOfBooks_in_Library() {
        val library = Library(null, Address(), "Test Library", 4.8f, listOf(
                Bookshelf(0, listOf(
                        Book(0, "Hallo Welt", "12345678912"),
                        Book(1, "Hello World", "21987654321")
                )),
                Bookshelf(1, listOf(
                        Book(2, "Hallo Welt", "12345678912"),
                        Book(3, "Hello World", "21987654321")
                ))
        ))
        assertEquals(4, library.getNumberOfBooks())
    }
}