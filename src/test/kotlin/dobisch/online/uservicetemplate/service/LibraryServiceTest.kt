package dobisch.online.uservicetemplate.service

import dobisch.online.uservicetemplate.data.Address
import dobisch.online.uservicetemplate.data.Bookshelf
import dobisch.online.uservicetemplate.data.Library
import dobisch.online.uservicetemplate.repository.LibraryRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LibraryServiceTest{
    val libraryRepository: LibraryRepository = mockk()
    val libraryService = LibraryService(libraryRepository)

    @Test
    fun libraryService_saves_library_successfully(){
        val reference = Library(null, Address(null),"TestLibrary",3.0f, Bookshelf(null))
        every { libraryRepository.save(reference) } returns Library(1, Address(1),"TestLibrary",3.0f, Bookshelf(1))
        val result = libraryService.saveLibrary(reference)

        assertEquals(1, result.id)
        assertNotNull(result.address)
        assertEquals(1, result.address.id)
        assertEquals("TestLibrary", result.name)
        assertEquals(3.0f, result.rating)
        assertNotNull(result.bookshelfs)
        assertEquals(1, result.bookshelfs.id)
    }
}