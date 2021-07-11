package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation_2nd {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation_2nd(Integer roomNumber, Date checkIn, Date checkOut) {
		super();
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}

	public String updateDates(Date checkIn, Date checkOut) {
		var now = new Date();
		if (checkIn.before(now) || checkOut.after(now)) {
			return "Update failed: you cannot set the check-in/out date to the past. Are you MAD?";
		}
		if (!checkOut.after(checkIn)) {
			System.out.println("Reservation failed: check-out must be after check-in. Are you NUTS?");
		}
			this.checkIn = checkIn;
			this.checkOut = checkOut;
			return "Reservation updated: " + toString();

	}

	@Override
	public String toString() {
		return "Reservation: Room num: " + roomNumber + ", Check-in: " + sdf.format(checkIn) + ", Check-out: "
				+ sdf.format(checkOut) + ", " + duration() + " nights";
	}

}
