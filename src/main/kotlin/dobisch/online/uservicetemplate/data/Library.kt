package dobisch.online.uservicetemplate.data

import jakarta.persistence.*
import lombok.AccessLevel
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor
import java.nio.charset.CoderResult
import java.util.stream.Stream

@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
class Library (
        @Id @GeneratedValue val id: Long? = null,
        @OneToOne val address: Address,
        val name: String,
        var rating: Float,
        @OneToMany val bookshelfs: List<Bookshelf>?=null,
){
    fun getNumberOfBooks(): Long? {
        return bookshelfs?.stream()?.flatMap { it.books?.stream() }?.count()
    }
}

@Entity
@NoArgsConstructor
class Bookshelf(
    @Id @GeneratedValue val id: Long? = null,
    @OneToMany val books: List<Book>?=null,
){
    fun getNumberOfBooks(): Int{
        return books!!.size
    }
}

@Entity
@NoArgsConstructor
class Book(
        @Id @GeneratedValue val id: Long? = null,
        val title: String,
        val isbn: String,
){

}

@Entity
@NoArgsConstructor
class Address (
    @Id @GeneratedValue val id: Long? = null,
//    var street: String,
)
