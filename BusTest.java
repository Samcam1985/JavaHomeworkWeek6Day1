import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class BusTest {
  Bus bus;
  Passenger passenger;

  @Before
  public void before() {
    bus = new Bus("Bussy McBusface");
    passenger = new Passenger();
  }

  @Test
  public void hasName() {
    assertEquals("Bussy McBusface", bus.getName());
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.peopleCount());
  }

  @Test
  public void canAddPassenger() {
    bus.add(passenger);
  
  assertEquals(1, bus.peopleCount());
}

@Test
public void cannotAddPassengerWhenBusIsFull() {
  for (int i = 0 ; i < 8; i++) {
    bus.add(passenger);
  }
  assertEquals(6, bus.peopleCount());
  }

  @Test
  public void busIsFull() {
    for (int i = 0; i < 6; i++) {
      bus.add(passenger);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void shouldEmptyBusAfterDroppingOff() {
    bus.add(passenger);
    bus.dropOff();
    assertEquals(0, bus.peopleCount());

  }
}
