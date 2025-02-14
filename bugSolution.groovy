def list = [1, 2, 3, 4, 5]

//Instead of using each, use collect to return the new list
println list.collect { it * 2 }

//Alternative solution using each and creating a new list
newList = []
list.each { newList << it * 2 }
println newList