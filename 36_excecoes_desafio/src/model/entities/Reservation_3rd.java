package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation_3rd {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reservation_3rd(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException{
		super();
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Reservation failed: check-out must be after check-in. Are you NUTS?");
		}
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

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		var now = new Date();
		if (checkIn.before(now) || checkOut.after(now)) {
			throw new DomainException("Update failed: you cannot set the check-in/out date to the past. Are you MAD?");
		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Update failed: you cannot set the check-in/out date to the past. Are you MAD?");
		}
			this.checkIn = checkIn;
			this.checkOut = checkOut;
			System.out.println("Reservation updated: " + toString());

	}

	@Override
	public String toString() {
		return "Reservation: Room num: " + roomNumber + ", Check-in: " + sdf.format(checkIn) + ", Check-out: "
				+ sdf.format(checkOut) + ", " + duration() + " nights";
	}

}
