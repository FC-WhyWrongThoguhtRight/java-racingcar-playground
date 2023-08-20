package model;

public class Name {
    String name;

    public Name(String name) {
        if(name == null){
            throw new NullPointerException("name은 null이 아니어야 합니다.");
        }
        if(name.isEmpty()){
            throw new StringIndexOutOfBoundsException("이름은 1글자 이상 이어야 합니다.");
        }
        if(name.length() > 5){
            throw new StringIndexOutOfBoundsException("이름은 5글자 이하 이여야 합니다.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
