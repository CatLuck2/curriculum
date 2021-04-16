package check;

public class Pet {

    // privateなのでPetクラス内でしかアクセス不可
    private String name;
    private String masterName;

    // Check.javaは同一パッケージなので、protectedか無し、でも実行される
    // privateだと、他クラスでコンストラクタできない、インスタンスを作成できない
    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }

    // 同一パッケージ、継承先からしかアクセス不可
    protected String getName() {
        return name;
    }

    protected String getMasterName() {
        return masterName;
    }

    public void introduce() {
        System.out.println("■僕の名前は" + name + "です");
        System.out.println("■ご主人様は" + masterName + "です");
    }
}

class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        // Petクラスのコンストラクタを使用
        super(name, masterName);
    }

    // Petクラスのintroduce()をオーバーライド(親クラスの同名メソッドを上書き)
    public void introduce() {
        // 下記の処理に書き換え
        System.out.println("◇私はロボット。名前は" + getName() + "。");
        System.out.println("◇ご主人様は" + getMasterName() + "。");
    }
}