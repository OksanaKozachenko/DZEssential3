package Task2;

public class Main {
    public static void main(String[] args) {
        ClassRoom [] classRoom=new ClassRoom[3];
        classRoom [0]=new ClassRoom(new ExcelentPupil());
        classRoom [1]=new ClassRoom(new BadPupil());
        classRoom [2]=new ClassRoom(new GoodPupil());

    }
}
