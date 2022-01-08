```text
//将两个二进制整数加起来的问题，这两个整数分别存储在n元数组A和B中。
// 这两个整数的和应按照二进制形式存储在一个（n+1）元数组C中

binary-add(A,B)
for i = 1 to A.length
    k=A[i]+b[i];
    if k>1
        C[i+1] = 1;
    C[i] = k%2 + C[i];
```