package small_exercise3.services.Impl;

import small_exercise2.models.Student;
import small_exercise2.utils.ReadAndWriteFile;
import small_exercise3.models.Experience;
import small_exercise3.services.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExperienceImpl implements Service {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Experience> experienceList;

    public static List<Experience> getExperienceList() {
        List<Experience> experienceList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src\\small_exercise3\\data\\v1.csv");
        for (String[] item : listStr) {
            experienceList.add(new Experience(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    Integer.parseInt(item[6]),
                    Integer.parseInt(item[7]),
                    item[8]));
        }
        return experienceList;
    }


    @Override
    public void display() {
    experienceList= getExperienceList();
    }

    @Override
    public void add() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void find() {

    }
}
