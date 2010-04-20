import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class RJScript {
	
    public static void EvalFile(String scriptEngine, String fileName) throws Exception {
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create JavaScript engine
        ScriptEngine engine = factory.getEngineByName(scriptEngine);
        // evaluate JavaScript code from given file - specified by first argument
        engine.eval(new java.io.FileReader(fileName));
    }
    
    public static void EvalScript(String scriptEngine, String script) throws Exception {
    	System.out.println(scriptEngine);
        // create a script engine manager
        ScriptEngineManager factory = new ScriptEngineManager();
        // create JavaScript engine
        ScriptEngine engine = factory.getEngineByName(scriptEngine);
        // evaluate JavaScript code from given file - specified by first argument
        Object result = engine.eval(script);   
        System.out.println(result);
        //return result.toString();
    }
    
    public static void main(String[] args) throws Exception {
    	EvalScript(args[0], args[1]);
    }

}

//java -cp "./;c:/jython2.5.1/jython.jar" RJScript "python" "1"
//java RJScript "JavaScript" "1"