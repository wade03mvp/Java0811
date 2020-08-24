package com.pcschool.ocp.d12_exception.case5;

public class Client {
    public static void main(String[] args) {
        accessLogin();
    }
    public static void accessLogin() {
        LoginService service = LoginService.getInstance(); // 利用 負載平衡(pool) 舒緩伺服器壓力 => 秒數 % 2 == 0 "us1", 秒數 % 2 == 1 "us2"
        String username = "john";
        String password = "12345";
        boolean check;
        try {
            check = service.login(username, password);
            System.out.println(check);
        } catch (LoginException ex) {
            System.out.println(ex.getMessage());
            ex.how2do();
        }
    }
}
