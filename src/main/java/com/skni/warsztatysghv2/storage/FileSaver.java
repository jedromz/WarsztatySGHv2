package com.skni.warsztatysghv2.storage;

import com.skni.warsztatysghv2.registration.Student;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@Service
public class FileSaver {
    private final String FILE_PATH = "src/main/resources/students.txt";

    public void saveToFile(Student student) {

        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(FILE_PATH, true)));
            pw.println(student);
            pw.close();
        } catch (IOException e) {
            System.err.println("Error writing to file in saveToFile()");
            e.printStackTrace();
        }

    }

}

