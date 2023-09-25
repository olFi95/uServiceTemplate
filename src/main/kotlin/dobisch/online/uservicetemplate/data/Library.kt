package dobisch.online.uservicetemplate.data

import jakarta.persistence.*

@Entity
class Library(
        @Id @GeneratedValue val id: Long? = null,
        @OneToOne val address: Address,
        val name: String,
        var rating: Float,
        @OneToMany val bookshelfs: List<Bookshelf>,
) {
    fun getNumberOfBooks(): Long? {
        return bookshelfs.parallelStream().flatMap { it.books.stream() }.count()
    }
}

@Entity
class Bookshelf(
        @Id @GeneratedValue val id: Long? = null,
        @OneToMany val books: List<Book>,
) {
    fun getNumberOfBooks(): Int {
        return books.size
    }
}

@Entity
class Book(
        @Id @GeneratedValue val id: Long? = null,
        val title: String,
        val isbn: String,
)

@Entity
class Address(
        @Id @GeneratedValue val id: Long? = null,
//    var street: String,
)
