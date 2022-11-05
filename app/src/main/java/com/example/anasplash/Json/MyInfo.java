package com.example.anasplash.Json;

import java.io.Serializable;

public class MyInfo implements Serializable {
    private String usuario;
    private String password;
    private String correo;
    private String edad;
    private String mascotas;

    private String getMascotas() {
        return mascotas;
    }

    public void setMascotas(String mascotas) {
        this.mascotas = mascotas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    private String fecha;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    private String  num;

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private String sexo;

    public String getTUsuario() {
        return TUsuario;
    }

    public void setTUsuario(String TUsuario) {
        this.TUsuario = TUsuario;
    }

    private String TUsuario;

    public MyInfo() {
    }

    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getCorreo() {
        return correo;
    }
    public void setedad(String edad) {
        this.edad = edad;
    }
    public String getedad() {
        return edad;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }



}


