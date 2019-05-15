package br.com.wswork.youtube.entity

import javax.persistence.*

@Entity
@Table(name = "wsw_pessoa")
class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wsw_pessoa_seq")
    @SequenceGenerator(name = "wsw_pessoa_seq", sequenceName = "wsw_pessoa_seq", allocationSize = 1)
    val id: Long? = null

    @Column(name = "nome")
    val nome: String? = null

    @Column(name = "area_id")
    val rg: Long? = null

    @Column(name = "email")
    val email: String? = null

    @Column(name = "cidade")
    val cidade: String? = null

    @Column(name = "estado")
    val estado: String? = null

}
