package com.fesc.student_attention.entities

import jakarta.persistence.*

@Entity
@Table(name = "user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    val id: Int = 0,

    @Column(name = "first_name")
    var firstName: String = "",

    @Column(name = "second_name")
    var secondName: String = ""
) {
    override fun toString(): String {
        return "User(id=$id, firstName='$firstName', secondName='$secondName')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false

        if (id != other.id) return false
        if (firstName != other.firstName) return false
        if (secondName != other.secondName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + firstName.hashCode()
        result = 31 * result + secondName.hashCode()
        return result
    }
}
