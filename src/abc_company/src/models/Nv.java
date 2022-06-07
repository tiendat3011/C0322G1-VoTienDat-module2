package models;

public abstract class Nv {
    private String id, idNv, name, dateOfBirth, address;

    public Nv() {
    }

    public Nv(String id, String idNv, String name, String dateOfBirth, String address) {
        this.id = id;
        this.idNv = idNv;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdNv() {
        return idNv;
    }

    public void setIdNv(String idNv) {
        this.idNv = idNv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nv{" +
                "id='" + id + '\'' +
                ", idNv='" + idNv + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public abstract String getLine();
}
