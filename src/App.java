import java.util.ArrayList;
import Students.Students;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();

        System.out.println(list);

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("--------------------Welcome--------------------");
            System.out.println("1: 新增");
            System.out.println("2: 修改");
            System.out.println("3: 删除");
            System.out.println("4: 查询");
            System.out.println("5: 退出");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    Students resault = add(list);
                    list.add(resault);
                    break;
                case 2:
                    edit();
                case 3:
                    ArrayList<Students> newList = remove(list);
                    System.out.println("last" + list);
//                    list = newList;
                    break;
                case 4:
                    search(list);
                    break;
                case 5:
                    System.out.println("退出系统");
                    break;
            }
        }
    }

    public static Students add(ArrayList<Students> list){
        Scanner sc = new Scanner(System.in);
        String id;
        System.out.println("请输入用户id");
        while (true){
            id = sc.next();
            boolean b = checkId(list, id);
            if (!b){
                System.out.println("id重复, 重新输入id");
            } else {
                break;
            }
        }

        System.out.println("请输入用户名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = sc.nextInt();
        System.out.println("请输入地址");
        String addess = sc.next();

        Students user = new Students(id, name, age, addess);
        return user;
    }

    public static boolean checkId(ArrayList<Students> list, String id){
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())){
                System.out.println("err");
                return false;
            }
        }
        return true;
    }

    public static void edit(){}

    public static ArrayList<Students> remove(ArrayList<Students> list){
        System.out.println("请输入要删除的id");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getId())){
                list.remove(i);
            }
        }
        System.out.println(list);
        return list;
    }

    public static void search(ArrayList<Students> list){
        System.out.println("id" + "姓名" + "年龄" + "地址");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(
                    list.get(i).getId() + " " + list.get(i).getName() + " " + list.get(i).getAge() + " " + list.get(i).getAddess()
            );
        }
    }
}
