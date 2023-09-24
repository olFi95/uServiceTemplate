package dobisch.online.uservicetemplate.data

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.NoArgsConstructor

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
class Library (
        @Id @GeneratedValue val id: Long? = null,
        @OneToOne val address: Address,
        val name: String,
        var rating: Float,
        @ManyToOne var bookshelfs: Bookshelf
)

@Entity
@NoArgsConstructor
class Bookshelf(
    @Id @GeneratedValue val id: Long? = null,
)
@Entity
@NoArgsConstructor
class Address (
    @Id @GeneratedValue val id: Long? = null,
//    var street: String,
)
