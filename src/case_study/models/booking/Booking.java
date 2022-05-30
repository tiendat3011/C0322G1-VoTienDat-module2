package case_study.models.booking;

import case_study.models.facility.Facility;
import case_study.models.person.Customer;

public abstract class Booking {
    private int idBooking;
    private String dayFirst;
    private String dayLast;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(int idBooking, String dayFirst, String dayLast, Customer customer, Facility facility) {
        this.idBooking = idBooking;
        this.dayFirst = dayFirst;
        this.dayLast = dayLast;
        this.customer = customer;
        this.facility = facility;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getDayFirst() {
        return dayFirst;
    }

    public void setDayFirst(String dayFirst) {
        this.dayFirst = dayFirst;
    }

    public String getDayLast() {
        return dayLast;
    }

    public void setDayLast(String dayLast) {
        this.dayLast = dayLast;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking" +
                "idBooking=" + idBooking +
                ", dayFirst='" + dayFirst + '\'' +
                ", dayLast='" + dayLast + '\'' +
                ", customer=" + customer +
                ", facility=" + facility ;
    }
}

