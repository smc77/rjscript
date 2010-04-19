import javax.script.*;

public class RJScript {
	
    public static void EvalFile(String scriptEngine, String fileName) throws Exception {
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create JavaScript engine
        ScriptEngine engine = factory.getEngineByName(scriptEngine);
        // evaluate JavaScript code from given file - specified by first argument
        engine.eval(new java.io.FileReader(fileName));
    }
    
    public static String EvalScript(String scriptEngine, String script) throws Exception {
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create JavaScript engine
        ScriptEngine engine = factory.getEngineByName(scriptEngine);
        // evaluate JavaScript code from given file - specified by first argument
        Object result = engine.eval(script);   
        return result.toString();
    }
    
    public static void main(String[] args) throws Exception {
    	EvalScript("JavaScript", args[0]);
    }

}