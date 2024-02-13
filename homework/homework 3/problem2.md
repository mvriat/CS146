Matrix Multiply
This one was a little confusing for me but I tried to use intuition here. I believe the time complexity would be O(n^3) for all cases, since there are three for loops. The rest of the lines take O(1). Here I comment on the non-constant time lines.
MATRIX_MULTIPLY(A, B): 
  if columns(A) ≠ rows(B): 
    raise ValueError("Matrix multiplication is not defined.") 

  rows_A ← number of rows in A 
  cols_A ← number of columns in A 
  cols_B ← number of columns in B 
  result ← matrix of size rows_A x cols_B filled with zeros 

  for i from 1 to rows_A do:                                     row a times
    for j from 1 to cols_B do:                                   col b times  
    sum ← 0                                                      row a * col b times
      for k from 1 to cols_A do:                                 col a times
        sum ← sum + A[i][k] * B[k][j]                            row a * col b * col a times
      result[i][j] ← sum return result                           row a * col b times
If you look at the multiplication of row a * col b * col a times, this is like multiplying a variable n three times and
therefore the highest order of growth would be O(n^3). You can see this in the form of ax^3 + bx^2 + cx + d.
