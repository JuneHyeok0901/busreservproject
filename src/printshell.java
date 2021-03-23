import java.util.Scanner;
public class printshell {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num;
            do{
                System.out.println("버스예매 프로그램입니다.");
                System.out.println("메뉴를 선택하세요");
                System.out.println("1.회원가입");
                System.out.println("2.로그인");
                System.out.println("3.종료");
                int year, num2, num3, num4, num5, num6, num7, num8, num9;
                String name, phone_num, findidname, findidnum, findpwdname, findpwdnum;
                String id;
                String pwd;
                num = sc.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("회원가입을 시작합니다.");
                        System.out.println("정보를 입력하세요");
                        System.out.print("이름 : ");
                        name = sc.next();
                        System.out.print("나이 : ");
                        year = sc.nextInt();
                        System.out.print("전화번호 : ");
                        phone_num = sc.next();
                        break;
                    case 2:
                        System.out.println("메뉴를 선택하세요");
                        System.out.println("1.로그인");
                        System.out.println("2.아이디, 비밀번호 찾기");
                        num2 = sc.nextInt();
                        sc.nextLine();
                        switch (num2) {
                            case 2:
                                System.out.println("메뉴를 선택하세요");
                                System.out.println("1.아이디 찾기");
                                System.out.println("2.비밀번호 찾기");
                                num3 = sc.nextInt();
                                switch(num3) {
                                    case 1:
                                        System.out.print("이름이 머에여 : ");
                                        findidnum = sc.next();
                                        System.out.print("전화번호 머에여 : ");
                                        findidnum = sc.next();
                                        break;
                                    case 2:
                                        System.out.print("이름이 머에여 : ");
                                        findpwdname = sc.next();
                                        System.out.print("전화번호 머에여 : ");
                                        findpwdnum = sc.next();
                                        break;
                                }
                                break;
                            case 1:
                                System.out.println("로그인 정보를 입력하세요");
                                System.out.print("아이디: ");
                                id = sc.next();
                                System.out.print("비밀번호: ");
                                pwd = sc.next();
                                System.out.println("로그인에 성공하였습니다.");


                                do {
                                    System.out.println("메뉴를 선택하세요");
                                    System.out.println("1.예매하기");
                                    System.out.println("2.정기권 구매");
                                    System.out.println("3.마이페이지");
                                    System.out.println("4.로그아웃");
                                    num4 = sc.nextInt();
                                    switch (num4) {
                                        case 1:
                                            System.out.println("날짜를 입력하세요");
                                            System.out.println("출발지,도착지를 입력하세요");
                                            System.out.println("버스정보ㅁㅁㅁㅁㅁ ");
                                            System.out.println("예매할 버스를 선택해주세요");
                                            System.out.println("예약할 좌석 수를 선택해주세요");
                                            System.out.println("선택한 버스 좌석정보ㅁㅁㅁㅁ");
                                            System.out.println("좌석을 선택해주세요");
                                            System.out.println("선택후 버스 좌석 정보ㅁㅁㅁㅁ ");
                                            System.out.println("금액은 ㅁㅁㅁㅁ입니다.");
                                            System.out.println("결제하시겠습니까?");
                                            System.out.println("1.예");
                                            System.out.println("2.ㄴ");
                                            num5 = sc.nextInt();
                                            System.out.println("결제가 완료되었습니다.");
                                            break;
                                        case 2:
                                            System.out.println("메뉴를 선택하세요: ");
                                            System.out.println("1.기간제");
                                            System.out.println("2.사용횟수제");
                                            num6 = sc.nextInt();
                                            switch (num6) {
                                                case 1:
                                                    System.out.println("1. 5회: ");
                                                    System.out.println("2. 10회: ");
                                                    System.out.println("3. 15회: ");
                                                    num7 = sc.nextInt();
                                                    break;
                                                case 2:
                                                    System.out.println("1. 5일: ");
                                                    System.out.println("2. 10일: ");
                                                    System.out.println("3. 15일: ");
                                                    num8 = sc.nextInt();
                                                    break;
                                            }
                                            System.out.println("결제되었습니다.");
                                            break;
                                        case 3:
                                            System.out.println("메뉴를 선택하세요: ");
                                            System.out.println("1. 회원정보수정");
                                            System.out.println("2. 결제내역조회");
                                            System.out.println("3. 포인트조회");
                                            System.out.println("4. 나의 예매내역 조회 및 취소");
                                            System.out.println("5. 정기권 조회");
                                            System.out.println("6. 회원탈퇴");
                                            num9 = sc.nextInt();
                                            break;
                                        case 4:
                                            System.out.println("로그아웃합니다.");
                                    }
                                }while(num4 != 4);
                        }
                    case 3:
                        System.out.println("프로그램을 종료합니다.");
                        break;
                }
            }while(num != 3);
        }
}
