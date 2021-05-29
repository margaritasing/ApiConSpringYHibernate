package com.example.apiclientescrm.entities;

import javax.persistence.*;

@Entity
@Table(name="clientes")
public class ClienteEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;
    private String  nombre;
    private String cargo;
    private String empresa;
    private String telefono;
    private String  mail;

    public ClienteEntity() {
    }

    public Integer getIdcliente() {
        return idcliente;
    }

    public void setId_cliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id_cliente=" + idcliente +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", telefono='" + telefono + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
