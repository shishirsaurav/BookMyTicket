package com.Learning.MovieTicket.resource;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class TicketResource {

	private long id;

	private String allottedSeats;

	private double amount;

	private Date bookedAt;

	private ShowResource show;
}