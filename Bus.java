public class Bus {

  private String name;
  private Passenger[] seats;


public Bus(String name) {
  this.name = name;
  this.seats = new Passenger[6];
}

public String getName() {
  return this.name;
}

public int peopleCount() {
  int numberOfPassenger = 0;

  for (Passenger passenger : this.seats) {
    if (passenger != null) {
      numberOfPassenger++;
    }

    }
    return numberOfPassenger;
  }

public void add(Passenger passenger) {
  if (isBusFull()) return;
  int index = peopleCount();
  this.seats[index] = passenger;
}

public boolean isBusFull() {
  return peopleCount() == this.seats.length;
}

public void dropOff() {
  for (int i=0; i < this.seats.length; i++) {
    this.seats[i] = null;
  }
}
}