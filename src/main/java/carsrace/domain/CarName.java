package carsrace.domain;

public class CarName {
    private String name;

    public CarName(String name) {
        validateNullCheck(name);
        validateLengthCheck(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validateNullCheck(String name){
        if(name == null || name.isEmpty()){
            throw new NullPointerException("차 이름의 빈값 또는 null 값을 입력할 수 없습니다.");
        }
    }

    private void validateLengthCheck(String name){
        if(name.length() > 5){
            throw new IllegalArgumentException("차 이름은 5글자를 초과할 수 없습니다.");
        }
    }




}
