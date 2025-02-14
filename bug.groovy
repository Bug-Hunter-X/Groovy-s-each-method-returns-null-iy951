def list = [1, 2, 3, 4, 5]

println list.each { it * 2 } //This will print null

println list.collect { it * 2 } //This will print the correctly multiplied list [2,4,6,8,10]