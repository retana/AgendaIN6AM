package org.retana.agendain6am.bean;

/**
 * Created by retana on 20/05/2016.
 */
public class Usuario {
    private Integer idUsuario;
    private String nombre;
    private String correo;
    private String nick;
    private String contraseña;
    private String token;
    private String exp;

    public Usuario() {
    }

    public Usuario(Integer idUsuario, String nombre, String correo, String nick, String contraseña, String token, String exp) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.correo = correo;
        this.nick = nick;
        this.contraseña = contraseña;
        this.token = token;
        this.exp = exp;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
