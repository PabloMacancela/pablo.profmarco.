package com.pablojmi.proyecto.model

import javax.persistence.*

@Entity
@Table(name = "usuario" )


class Usuario {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id : Long? = null
    var username : String? = null
    var password: String? = null
    var materias: String? = null
    var asistencias: Long? = null
    @Column(name="profesor_id")
    var profesorId:Long?=null
    @Column(name="representante_id")
    var representanteId:Long?=null



}