.jscall <- function(script, script.engine="JavaScript"){
   rjs <- .jnew("RJScript") 
   out <- .jcall(rjs, "V", "EvalScript", as.character(script.engine), as.character(script))
   return(out)
}

#.jscall(script="function fib(n) { if(n <= 1) return n; return fib(n-1) + fib(n-2); }; fib(20);")
#.jscall(script="print 'Python - Hello, world!'", script.engine="python")

#.jscall(script="print 'hello'", script.engine="python")
#.jscall(script="print('hello')", script.engine="JavaScript")