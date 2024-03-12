package Controllers;

import dtos.BookMovieRequestDto;
import dtos.BookMovieResponseDto;
import models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import Services.BookingService;

@Controller
public class BookingController {
    private BookingService bookingService;
    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookMovieResponseDto bookMovie(BookMovieRequestDto bookMovieRequestDto) {
        BookMovieResponseDto response = new BookMovieResponseDto();

        try {
            Booking booking = bookingService.bookMovie(bookMovieRequestDto.getUserId(),
                    bookMovieRequestDto.getShowId(),
                    bookMovieRequestDto.getShowSeatIds());

            response.setBookingId(booking.getId());
            response.setResponseStatus(ResponseStatus.SUCCESS);
            response.setAmount(booking.getAmount());
        } catch (RuntimeException runtimeException) {
            response.setResponseStatus(ResponseStatus.FAILURE);
        }

        return response;
    }

    public Booking cancelMovie() {
        return null;
    }

}
