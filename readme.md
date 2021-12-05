# Recursion
##Calling a method within itself
# Base case that will end repetition
# Recursive code
	
	public static int sum (int target){
	if (target <=0)
		return 0;
	else
		return target + sum(target -1) ;
	}
	
	
	(10+(9+(8+(7+(6+(5+(4+(3+(2+(+1(+0)))))))))))
	(10+(9+(8+(7+(6+(5+(4+(3+(2+(+1))))))))))
	(10+(9+(8+(7+(6+(5+(4+(3+(3)))))))))
	(10+(9+(8+(7+(6+(5+(4+(6))))))))
	(10+(9+(8+(7+(6+(5+(10)))))))
	(10+(9+(8+(7+(6+(15))))))
	(10+(9+(8+(7+(21)))))
	(10+(9+(8+(28))))
	(10+(9+(36)))
	(10+(45))
	(55)
	
# Fibonacci
# fn = fn-1 + fn-2
# 0