package Task2;

import java.sql.SQLOutput;

public class ExcelentPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("Excellent study");
    }

    @Override
    public void read() {
        System.out.println("Excellent read");
    }

    @Override
    public void write() {
        System.out.println("Excellent write");
    }

    @Override
    public void relax() {
        System.out.println("Excellent relax");
    }
}
