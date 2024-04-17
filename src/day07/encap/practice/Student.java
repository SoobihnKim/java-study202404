package day07.encap.practice;

public class Student {
    /*
     **학생 정보 시스템**
    - 학생의 이름(name), 학번(studentId), 학과(department) 정보를 관리하는 `Student` 클래스를 만드세요.
    - 모든 정보 필드는 private으로 선언하고, 각 필드의 getter와 setter 메소드를 public으로 만드세요.
    - setter 메소드에서는 유효하지 않은 입력(예: null 값 또는 빈 문자열)에 대한 검증 로직을 포함하세요.
     */

    private String name;
    private String studentId;
    private String department;

    // 생성자 - 기본생성자라 안써도됨
    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("유효하지 않은 이름입니다.");
            return;
        } else {
            this.name = name;
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (name == null || name.isEmpty()) {
            System.out.println("입력해주세요.");
            return;
        } else {
            this.studentId = studentId;
        }
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (name == null || name.isEmpty()) {
            System.out.println("입력해주세요.");
            return;
        } else {
            this.department = department;
        }
    }
}
