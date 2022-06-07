package utils;

public class NotFoundEmployeeException extends Exception {
    @Override
    public String getMessage() {
        return "Không có trong danh sách";
    }
}
