package chapter5.passdataamongmethods;

// Pass-by-value - return value:
// return value of methods is simply a copy of the primitive/reference value
// if the result is not used/assigned, it is just ignored
public class ZooTickets {
    public static void main(String[] args) {
        int tickets = 2;
        String guests = "abc";
        addTickets(tickets); // this operation doesn't affect tickets because there is no assignment
        guests = addGuests(guests);
        System.out.println(tickets + guests); // 2abcd
    }

    public static int addTickets(int tickets) {
        tickets++;
        return tickets;
    }

    public static String addGuests(String guests) {
        guests += "d";
        return guests;
    }
}
