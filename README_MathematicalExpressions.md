# MathematicalExpressions - Expressions Calculator

## What it does

Calculates two expressions:
- e1 = ((a + b) * (c * a + (a * a)) – b * b) / (( c + d) * (c - d))
- e2 = x + y % z * 5 – y

## How to run

Compile it:
```bash
javac MathematicalExpressions.java
```

Run it:
```bash
java MathematicalExpressions
```

## Example

**Input:**
```
Enter a: 2.5
Enter b: 3.0
Enter c: 4.0
Enter d: 1.0
Enter x: 10
Enter y: 15
Enter z: 4
```

**Output:**
```
e1 = 4.833333333333333
e2 = 1
```

## Notes

- Variables a, b, c, d, e1 are `double`
- Variables x, y, z, e2 are `int`
- Make sure (c + d) * (c - d) isn't zero or you'll get a division by zero error

