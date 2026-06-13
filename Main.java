import java.util.*;

class Road {
    String name;
    int vehicleCount;
    boolean emergency;

    Road(String name, int vehicleCount, boolean emergency) {
        this.name = name;
        this.vehicleCount = vehicleCount;
        this.emergency = emergency;
    }

    int getGreenTime() {
        if (vehicleCount <= 10)
            return 10;
        else if (vehicleCount <= 20)
            return 20;
        else if (vehicleCount <= 30)
            return 30;
        else
            return 40;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalVehiclesProcessed = 0;
        int cycles;

        System.out.print("Enter number of traffic cycles: ");
        cycles = sc.nextInt();

        for (int cycle = 1; cycle <= cycles; cycle++) {

            System.out.println("\n========== CYCLE " + cycle + " ==========");

            PriorityQueue<Road> pq = new PriorityQueue<>(
                (a, b) -> {
                    if (a.emergency && !b.emergency)
                        return -1;
                    if (!a.emergency && b.emergency)
                        return 1;
                    return b.vehicleCount - a.vehicleCount;
                }
            );

            for (int i = 1; i <= 4; i++) {

                System.out.print("Road " + i + " vehicle count: ");
                int vehicles = sc.nextInt();

                System.out.print("Emergency vehicle present? (true/false): ");
                boolean emergency = sc.nextBoolean();

                pq.offer(new Road("Road " + i, vehicles, emergency));
            }

            System.out.println("\n----- Signal Allocation -----");

            while (!pq.isEmpty()) {

                Road current = pq.poll();

                System.out.println("\nGreen Signal -> " + current.name);

                if (current.emergency) {
                    System.out.println("EMERGENCY VEHICLE DETECTED");
                }

                System.out.println("Vehicles Waiting : " + current.vehicleCount);
                System.out.println("Green Time       : "
                        + current.getGreenTime() + " seconds");

                totalVehiclesProcessed += current.vehicleCount;

                try {
                    Thread.sleep(1000); // demo delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("\n========== STATISTICS ==========");
        System.out.println("Total Cycles Completed : " + cycles);
        System.out.println("Total Vehicles Processed : "
                + totalVehiclesProcessed);

        double average =
                (double) totalVehiclesProcessed / (cycles * 4);

        System.out.printf("Average Vehicles Per Road : %.2f%n", average);

        System.out.println("\nSystem Shutdown Successfully.");

        sc.close();
    }
}