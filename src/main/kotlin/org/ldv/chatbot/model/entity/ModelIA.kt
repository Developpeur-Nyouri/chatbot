package org.ldv.chatbot.model.entity

import jakarta.persistence.*

@Entity
class ModelIA (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    var id: Long? = null,

    var nom: String,

    var urlAPI: String,

    var version: String,

    var description: String,

    var cheminLogo: String,

    @ManyToOne
    @JoinColumn(name = "fournisseur_ia_id", nullable = false)
    var fournisseurIA: FournisseurIA
) {
}