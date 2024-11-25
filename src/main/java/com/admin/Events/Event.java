package com.admin.Events;

public class Event {
	private int idEvent;
	private String EventName;
	private String EventDate;
	private String EventLocation;
	private String EventDescription;
	private String EventOrganizer;
	private String EventContact;
	private String EventImage;
	private int EventParticipants;
	
	
	
	//parameterized constructor
	public Event(int idEvent, String eventName, String eventDate, String eventLocation, String eventDescription,
			String eventOrganizer, String eventContact, String eventImage, int eventParticipants) {
		super();
		this.idEvent = idEvent;
		EventName = eventName;
		EventDate = eventDate;
		EventLocation = eventLocation;
		EventDescription = eventDescription;
		EventOrganizer = eventOrganizer;
		EventContact = eventContact;
		EventImage = eventImage;
		EventParticipants = eventParticipants;
	}
	
	//default constructor
	public Event() {
		
	}

	//getters and setters
	public int getIdEvent() {
		return idEvent;
	}
	public void setIdEvent(int idEvent) {
		this.idEvent = idEvent;
	}
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public String getEventDate() {
		return EventDate;
	}
	public void setEventDate(String eventDate) {
		EventDate = eventDate;
	}
	public String getEventLocation() {
		return EventLocation;
	}
	public void setEventLocation(String eventLocation) {
		EventLocation = eventLocation;
	}
	public String getEventDescription() {
		return EventDescription;
	}
	public void setEventDescription(String eventDescription) {
		EventDescription = eventDescription;
	}
	public String getEventOrganizer() {
		return EventOrganizer;
	}
	public void setEventOrganizer(String eventOrganizer) {
		EventOrganizer = eventOrganizer;
	}
	public String getEventContact() {
		return EventContact;
	}
	public void setEventContact(String eventContact) {
		EventContact = eventContact;
	}
	public String getEventImage() {
		return EventImage;
	}
	public void setEventImage(String eventImage) {
		EventImage = eventImage;
	}
	public int getEventParticipants() {
		return EventParticipants;
	}
	public void setEventParticipants(int eventParticipants) {
		EventParticipants = eventParticipants;
	}

}
