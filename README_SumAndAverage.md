# SumAndAverage - Sum and Average Calculation

## What it does

Takes three numbers (a, b, c), calculates their sum and average, then prints both.

## Flowchart

```mermaid
flowchart TD
    A([Start]) --> B[/Input: a, b, c/]
    B --> C[Process: sum = a + b + c]
    C --> D[Process: average = sum / 3.0]
    D --> E[/Output: sum, average/]
    E --> F([End])
```

## How to run

Compile it:
```bash
javac SumAndAverage.java
```

Run it:
```bash
java SumAndAverage
```

## Example

**Input:**
```
Enter a: 10.5
Enter b: 20.3
Enter c: 15.2
```

**Output:**
```
sum = 46.0
average = 15.3333333333
```

