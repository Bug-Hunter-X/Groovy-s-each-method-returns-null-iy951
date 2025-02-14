# Groovy Each Method Returns Null

This example demonstrates a common mistake in Groovy when using the `each` method.  The `each` method iterates over a collection, but it doesn't return a modified collection. Instead, it returns `null`.  This is often unexpected for those coming from other languages.

The `collect` method, on the other hand, returns a *new* collection containing the transformed elements.  This is the preferred method when you need to transform a collection and get the result back.

## How to reproduce the bug
1. Copy the code in `bug.groovy`
2. Run the script using Groovy
3. Observe the output, the `each` example prints null, while the `collect` example prints the modified list.