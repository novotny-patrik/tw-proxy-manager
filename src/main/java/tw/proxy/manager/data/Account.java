package tw.proxy.manager.data;

import jakarta.persistence.Entity;

@Entity
public class Account extends AbstractEntity {

    private String server;
    private String username;
    private String password;
    private boolean active;
    private Integer proxyId;

    public String getServer() {
        return server;
    }
    public void setServer(String server) {
        this.server = server;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public Integer getProxyId() {
        return proxyId;
    }
    public void setProxyId(Integer proxyId) {
        this.proxyId = proxyId;
    }

}
