package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.HashSet;
<<<<<<< HEAD
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;

=======
import java.util.Set;

/**
 * Created by jt, Spring Framework Guru.
 */
@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
>>>>>>> origin/4-bootstrap-data

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

<<<<<<< HEAD
=======
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

>>>>>>> origin/4-bootstrap-data
    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
<<<<<<< HEAD
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
=======
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
>>>>>>> origin/4-bootstrap-data
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
<<<<<<< HEAD
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;
        return Objects.equals(id, author.id);
=======
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        return getId() != null ? getId().equals(author.getId()) : author.getId() == null;
>>>>>>> origin/4-bootstrap-data
    }

    @Override
    public int hashCode() {
<<<<<<< HEAD
        return Objects.hashCode(id);
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }




}
=======
        return getId() != null ? getId().hashCode() : 0;
    }
}











>>>>>>> origin/4-bootstrap-data
