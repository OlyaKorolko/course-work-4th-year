package by.issoft.controller.utils.suppliers;

import by.issoft.domain.cinema.Cinema;
import by.issoft.domain.cinema.MovieRoom;
import by.issoft.domain.cinema.RoomType;
import by.issoft.domain.cinema.Seat;

import java.util.List;

public class CinemaSupplier {
    public static Cinema getCinema() {
        return Cinema.builder()
                .name("Test cinema")
                .email("ccc@sa")
                .phone("+45343648543")
                .city("Moscow")
                .address("ssssssss")
                .movieRooms(List.of(MovieRoom.builder()
                        .capacity(2)
                        .roomType(RoomType.builder()
                                .id(1L)
                                .build())
                        .seats(List.of(
                                Seat.builder()
                                        .rowNumber(1)
                                        .placeNumber(1)
                                        .build(),
                                Seat.builder()
                                        .rowNumber(1)
                                        .placeNumber(2)
                                        .build())
                        )
                        .build()))
                .build();
    }

    public static String getCinemaJson() {
        return "{\"name\": \"Test cinema\"," +
                "    \"address\": \"ssssssss\"," +
                "    \"city\": \"Moscow\"," +
                "    \"email\": \"ccc@sa\"," +
                "    \"phone\": \"+45343648543\"," +
                "    \"movieRooms\": [" +
                "        {" +
                "            \"capacity\": 2," +
                "            \"roomTypeId\": 1," +
                "            \"seats\": [" +
                "                {" +
                "                    \"rowNumber\": 1," +
                "                    \"placeNumber\": 1" +
                "                }," +
                "                {" +
                "                    \"rowNumber\": 1," +
                "                    \"placeNumber\": 2" +
                "                }" +
                "            ]" +
                "        }" +
                "   ]" +
                "}";
    }
}
