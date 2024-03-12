package dtos;

import lombok.Getter;
import lombok.Setter;
import models.ResponseStatus;
@Getter
@Setter
public class BookMovieResponseDto {
    private Long bookingId;
    private int amount;
    private ResponseStatus responseStatus;
}
