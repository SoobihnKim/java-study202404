package day07.encap.practice;

public class BankAccount {

    /*
     **은행 계좌 클래스 만들기**
    - 은행 계좌를 관리하는 `BankAccount` 클래스를 만드세요.
    - 계좌 잔액(balance), 계좌 번호(accountNumber), 계좌 주인의 이름(accountHolder) 필드를 private로 선언하세요.
    - 잔액 조회, 입금, 출금 메소드를 public으로 만들어 외부에서 접근할 수 있게 하세요.
    - 출금 메소드는 잔액이 출금하려는 금액보다 클 때만 돈을 출금할 수 있도록 하세요.
     */

    private long balance;
    private String accountNumber;
    private String accountHolder;

    // 생성자
    public BankAccount(String accountNumber, String accountHolder, long balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // 메소드
    // 잔액 조회
    public long getBalance() {
        return balance;
    }

    // 입금
    public void deposit(int money) {
        if (money < 0) {
            System.out.println("입금액은 음수일 수 없습니다.");
            return;
        }
        this.balance = balance + money;
    }

    // 출금
    public void withdraw(int money) {
        if (this.balance < money || money < 0) {
            System.out.println("잔액이 부족합니다.");
        } else {
            this.balance = balance - money;
        }
    }

}
