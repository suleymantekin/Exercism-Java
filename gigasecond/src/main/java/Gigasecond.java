import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime now;
    private static long GIGASECONDS = 1000000000L;

    Gigasecond(LocalDate birthDate) {
      this.now = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
      this.now = birthDateTime;
    }

    LocalDateTime getDate() {
      return now.plusSeconds(GIGASECONDS);
    }
}
