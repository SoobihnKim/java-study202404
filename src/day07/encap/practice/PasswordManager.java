package day07.encap.practice;

import java.util.SplittableRandom;

public class PasswordManager {
    /*
     **비밀번호 관리 클래스**
    - 사용자의 비밀번호를 관리하는 `PasswordManager` 클래스를 작성하세요.
    - 비밀번호(password) 필드는 private으로 선언하고, 비밀번호를 설정하고 변경할 수 있는 메소드를 public으로 만드세요.
    - 비밀번호 변경 시 현재 비밀번호를 입력받아야만 변경 가능하도록 구현하세요.
     */

    private String password;

    // 생성자
    public PasswordManager(String password) {
        this.password = password;
    }

    // 메소드

    /**
     * 이 메서드는 비밀번호를 변경해주는 공개된 메서드로서
     * 사용자는 기존에 사용하던 패스워드를 올바르게 전달하고
     * 새롭게 사용할 패스워드를 전달합니다.
     *
     * @param password       - 기존에 사용하던 비밀번호
     * @param changePassword - 새롭게 변경할 비밀번호
     * @return - 변경에 성공하면 true, 실패하면 false
     */
    public boolean changePassword(String password, String changePassword) {
        if (this.password.equals(password)) {
            this.password = changePassword;
            return true;
        } else {
            return false;
        }
    }

    public String getPassword() {
        return password;
    }
}