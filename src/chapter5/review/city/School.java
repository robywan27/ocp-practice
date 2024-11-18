package chapter5.review.city;

import chapter5.review.school.*;

// exercise 9

public class School {
    public static void main(String[] args) {
//        System.out.println(ClassRoom.globalKey); // not visible in this package
//        Classroom room = new Classroom(101, "Anderson"); // Classroom's constructor not visible in this package
//        System.out.println(room.roomNumber); // private visibility
        System.out.println(Classroom.floor);
//        System.out.println(Classroom.teacherName); // not in the same package nor a subclass
    }
}
