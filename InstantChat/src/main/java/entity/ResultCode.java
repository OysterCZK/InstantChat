package entity;

enum ResultCode {

    SUCCESS(2),
    ERROR(1);

    private Integer code;

    ResultCode(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
