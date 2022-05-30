package case_study.services;

import java.io.IOException;

public interface Service {
    void display() throws IOException;

    void addNew();

    void edit() throws IOException;

    void delete();


}
