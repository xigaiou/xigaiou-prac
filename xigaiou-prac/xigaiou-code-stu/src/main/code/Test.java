import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        List<TestEntity> list = new ArrayList<>();
        list.add(new TestEntity("陈1"));
        System.out.println(list);

        Map<String, String> nameMap = new HashMap<>();
        nameMap.put("社長", "小林さん");x
        nameMap.put("会社員", "友利奈緒");

        for(Map.Entry<String, String> entry : nameMap.entrySet()){
            String out = String.format("仕事:%s,名前:%s",entry.getKey(),entry.getValue());
            System.out.println(out);
        }

    }
}
