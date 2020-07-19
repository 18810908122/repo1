package firstMacJava;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Test9 {
    public static void main(String[] args) throws Exception {
        // 获得 当前所支持的所有脚本
        ScriptEngineManager sem = new ScriptEngineManager();
        // 获取js引擎
        // 方式1：通过脚本名称获取
        ScriptEngine se1 = sem.getEngineByName("JavaScript");
        // 方式2：通过文件扩展名获取：
        ScriptEngine se2 = sem.getEngineByExtension("js");
        // 方式3：通过MIME类型来获取：
        ScriptEngine se3 = sem.getEngineByMimeType("text/javascript");
        System.out.println(se1.eval("a*2".replace("a", "2")));
        System.out.println(se2.eval("a*2".replace("a", "2")));
        System.out.println(se3.eval("a*2".replace("a", "2")));
    }
}
