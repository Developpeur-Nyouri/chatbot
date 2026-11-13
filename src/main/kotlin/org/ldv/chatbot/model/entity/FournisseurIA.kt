package org.ldv.chatbot.model.entity

import jakarta.persistence.*

@Entity
class FournisseurIA (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    var nom: String,

    var cheminLogo: String,

    var description: String
) {
}