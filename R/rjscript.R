.jscall <- function(script, script.engine="JavaScript"){
   rjs <- .jnew("RJScript") 
   out <- .jcall(rjs, , "EvalScript", as.character(script.engine), as.character(script))
   return(out)
}

#runJScript(script="print('Hello, World')")
#.jcall(rjs, "Object", "EvalScript", "JavaScript", "print('hello')")
#
#runJScript(script="print('hello')")
#runJScript(script.engine="jruby", script="puts('Hello')")
#
#.jscall(script="function fib(n) { if(n <= 1) return n; return fib(n-1) + fib(n-2); }; fib(20);")