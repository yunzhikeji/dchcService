package com.yz.po;

public class Clientversion {
    private Integer id;

    private String versionname;

    private String versionshort;

    private String updateurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname == null ? null : versionname.trim();
    }

    public String getVersionshort() {
        return versionshort;
    }

    public void setVersionshort(String versionshort) {
        this.versionshort = versionshort == null ? null : versionshort.trim();
    }

    public String getUpdateurl() {
        return updateurl;
    }

    public void setUpdateurl(String updateurl) {
        this.updateurl = updateurl == null ? null : updateurl.trim();
    }
}