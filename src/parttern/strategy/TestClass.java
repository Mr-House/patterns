package parttern.strategy;

/**
 * Simple To Introduction
 * 项目名称:  [${project_name}]
 * 包:        [${package_name}]
 * 类名称:    [${type_name}]
 * 类描述:    [一句话描述该类的功能]
 * 创建人:    [${user}]
 * 创建时间:  [${date} ${time}]
 * 修改人:    [${user}]
 * 修改时间:  [${date} ${time}]
 * 修改备注:  [说明本次修改内容]
 * 版本:      [v1.0]
 */
public class TestClass {
    public static void main(String[] args) {
        Character king = new King();
        king.setWeaponBehavior(new KnifeBehavior());
        king.fight();
        Character queen = new Queen();
        queen.setWeaponBehavior(new SwordBehavior());
        queen.fight();
    }
}
