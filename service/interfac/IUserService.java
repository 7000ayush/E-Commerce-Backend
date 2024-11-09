package com.hma.hotel.service.interfac;

import com.hma.hotel.dto.LoginRequest;
import com.hma.hotel.dto.Response;
import com.hma.hotel.entity.User;

public interface IUserService {

Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);


}
