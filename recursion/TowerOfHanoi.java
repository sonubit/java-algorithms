package recursion;

public class TowerOfHanoi {

    public static void solve(
            int disks,
            char source,
            char auxiliary,
            char destination) {

        if (disks <= 0) {
            return;
        }

        solve(
                disks - 1,
                source,
                destination,
                auxiliary
        );

        System.out.println(
                "Move disk " + disks
                        + " from " + source
                        + " to " + destination
        );

        solve(
                disks - 1,
                auxiliary,
                source,
                destination
        );
    }

    public static void main(String[] args) {

        solve(3, 'A', 'B', 'C');
    }
}
