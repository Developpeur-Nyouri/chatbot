package org.ldv.chatbot.model.dao

import org.ldv.chatbot.model.entity.ModelIA
import org.springframework.data.jpa.repository.JpaRepository

interface ModelIADAO : JpaRepository<ModelIA, Long> {
}