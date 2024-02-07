Palindrome
The solution was rather simple since all you have to do is read the characters of the word backward and check if they're equal. In both languages, you have to take the string and convert it to lowercase and remove the non-alphanumerical characters. Then create a character array with the string, and create and new array to later store the backwards versoin which is done by traversing the array starting from the end. Then check if they're equal and boom return true/false. It's way simpler in Python since the line
backwards = normal[::-1}
does most of the work.
