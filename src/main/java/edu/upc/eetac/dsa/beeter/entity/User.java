package edu.upc.eetac.dsa.beeter.entity;

import javax.ws.rs.core.Link;
import java.util.List;

/**
 * Created by Marti on 16/01/2016.
 */
public class User {
    @InjectLinks({})
    private List<Link> links;
    private String id;
    private String loginid;
    private String email;
    private String fullname;

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}