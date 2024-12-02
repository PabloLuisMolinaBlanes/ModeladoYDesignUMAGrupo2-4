package ApartadoD;

import java.util.*;

public class Socio {
    private Date registro;
    private Refugio refugio;

    private final Map<Class<?>, Object> roles = new HashMap<>();

    public Socio(Date registro, Refugio refugio) {
        this.registro = registro;
        this.refugio = refugio;
    }

    public <T> void addRole(Class<T> roleType, T role) {
        roles.put(roleType, role);
    }

    public <T> T getRole(Class<T> roleType) {
        return roleType.cast(roles.get(roleType));
    }

    public Date getRegistro() {
        return registro;
    }

    public void setRegistro(Date registro) {
        this.registro = registro;
    }

    public Refugio getRefugio() {
        return refugio;
    }

    public void setRefugio(Refugio refugio) {
        this.refugio = refugio;
    }

}