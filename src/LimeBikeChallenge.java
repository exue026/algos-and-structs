import java.util.ArrayList;
import java.util.HashMap;

public class LimeBikeChallenge {

    public static void main(String[] args) {

    }

    public class Ride {

        private int startTime;
        private int endTime;
        private HashMap<String, Integer> items;

        public Ride(String timeInterval, HashMap<String, Integer> items) {

            this.items = items;
        }

        String getTimeInterval() {
            return timeInterval;
        }

        HashMap<String, Integer> getItems() {
            return items;
        }
    }

    public class ItemCounter {

        private ArrayList<Ride> rides;

        void process_ride(Ride ride) {
            rides.add(ride);
        }

        void print_items_per_interval() {

        }
    }
}
