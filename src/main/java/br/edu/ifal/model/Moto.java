package br.edu.ifal.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "motos")
public class Moto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String modelo;
    private String marca;
    private Double cilindradas;
    private int contador_dias;
    private int media_diaria_km;

    private Double km_max_troca_oleo;
    private Double km_max_acelerador;
    private Double km_max_vela;
    private Double km_max_freio;
    private Double km_max_embreagem;
    private Double km_max_pneus;
    private Double km_max_suspensao;

    private Double km_atual_troca_oleo;
    private Double km_atual_acelerador;
    private Double km_atual_vela;
    private Double km_atual_freio;
    private Double km_atual_embreagem;
    private Double km_atual_pneus;
    private Double km_atual_suspensao;
    
    


    @JsonIgnore
    @OneToOne
    private Usuario usuario;

    private long id_usuario;

    @CreationTimestamp
    private LocalDateTime dataDeCriacao;

    @UpdateTimestamp
    private LocalDateTime dataDeAlteracao;

    public Moto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public LocalDateTime getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(LocalDateTime dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public LocalDateTime getDataDeAlteracao() {
        return dataDeAlteracao;
    }

    public void setDataDeAlteracao(LocalDateTime dataDeAlteracao) {
        this.dataDeAlteracao = dataDeAlteracao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getKm_max_troca_oleo() {
        return km_max_troca_oleo;
    }

    public void setKm_max_troca_oleo(Double km_max_troca_oleo) {
        this.km_max_troca_oleo = km_max_troca_oleo;
    }

    public Double getKm_max_acelerador() {
        return km_max_acelerador;
    }

    public void setKm_max_acelerador(Double km_max_acelerador) {
        this.km_max_acelerador = km_max_acelerador;
    }

    public Double getKm_max_vela() {
        return km_max_vela;
    }

    public void setKm_max_vela(Double km_max_vela) {
        this.km_max_vela = km_max_vela;
    }

    public Double getKm_max_freio() {
        return km_max_freio;
    }

    public void setKm_max_freio(Double km_max_freio) {
        this.km_max_freio = km_max_freio;
    }

    public Double getKm_max_embreagem() {
        return km_max_embreagem;
    }

    public void setKm_max_embreagem(Double km_max_embreagem) {
        this.km_max_embreagem = km_max_embreagem;
    }

    public Double getKm_max_pneus() {
        return km_max_pneus;
    }

    public void setKm_max_pneus(Double km_max_pneus) {
        this.km_max_pneus = km_max_pneus;
    }

    public Double getKm_max_suspensao() {
        return km_max_suspensao;
    }

    public void setKm_max_suspensao(Double km_max_suspensao) {
        this.km_max_suspensao = km_max_suspensao;
    }

    public Double getKm_atual_troca_oleo() {
        return km_atual_troca_oleo;
    }

    public void setKm_atual_troca_oleo(Double km_atual_troca_oleo) {
        this.km_atual_troca_oleo = km_atual_troca_oleo;
    }

    public Double getKm_atual_acelerador() {
        return km_atual_acelerador;
    }

    public void setKm_atual_acelerador(Double km_atual_acelerador) {
        this.km_atual_acelerador = km_atual_acelerador;
    }

    public Double getKm_atual_vela() {
        return km_atual_vela;
    }

    public void setKm_atual_vela(Double km_atual_vela) {
        this.km_atual_vela = km_atual_vela;
    }

    public Double getKm_atual_freio() {
        return km_atual_freio;
    }

    public void setKm_atual_freio(Double km_atual_freio) {
        this.km_atual_freio = km_atual_freio;
    }

    public Double getKm_atual_embreagem() {
        return km_atual_embreagem;
    }

    public void setKm_atual_embreagem(Double km_atual_embreagem) {
        this.km_atual_embreagem = km_atual_embreagem;
    }

    public Double getKm_atual_pneus() {
        return km_atual_pneus;
    }

    public void setKm_atual_pneus(Double km_atual_pneus) {
        this.km_atual_pneus = km_atual_pneus;
    }

    public Double getKm_atual_suspensao() {
        return km_atual_suspensao;
    }

    public void setKm_atual_suspensao(Double km_atual_suspensao) {
        this.km_atual_suspensao = km_atual_suspensao;
    }

    public int getContador_dias() {
        return contador_dias;
    }

    public void setContador_dias(int contador_dias) {
        this.contador_dias = contador_dias;
    }

    public int getMedia_diaria_km() {
        return media_diaria_km;
    }

    public void setMedia_diaria_km(int media_diaria_km) {
        this.media_diaria_km = media_diaria_km;
    }

    
}