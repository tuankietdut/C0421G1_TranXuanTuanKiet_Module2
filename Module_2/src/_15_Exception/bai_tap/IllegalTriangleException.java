package _15_Exception.bai_tap;

import java.security.NoSuchAlgorithmException;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

//    @Override
//    public String getMessage() {
//        return "Value of triangle or sum wrong";
//    }
}
