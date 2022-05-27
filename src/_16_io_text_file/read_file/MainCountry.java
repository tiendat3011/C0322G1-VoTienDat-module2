package _16_io_text_file.read_file;


import java.util.ArrayList;

import java.util.List;

public class MainCountry {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        List<String[]> strings1 =ReadAndWriteFile.read("src\\_16_io_text_file\\read_file\\country.csv");
        for (String[] item: strings1) {
            Country country = new Country( Integer.parseInt(item[0]),item[1],item[2]);
            countries.add(country);
        }
        for (Country country : countries){
            System.out.println(country);
        }
    }
}
