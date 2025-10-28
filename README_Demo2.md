## Demo2 Overview

- **Idea**: Read the number of chapters, compute the cost in rials as 0.300 × chapters, then print the result.

## Flowchart
- **Start/End**: Oval
- **Process**: Rectangle
- **Input/Output**: Parallelogram
- **Flow**: Arrows

```mermaid
flowchart TD
    A([Start]) --> B[/Input: number of chapters/]
    B --> C[Process: rialprice = 0.300 × chapters]
    C --> D[/Output: "The cost is: " + rialprice/]
    D --> E([End])
```

### ASCII Flowchart (fallback)
```
  (Start)
     |
  / Input: number of chapters \
     |
  [ Process: rialprice = 0.300 × chapters ]
     |
  / Output: "The cost is: " + rialprice \
     |
    (End)
```

## How to Run
- **Compile**:
```bash
javac demo2.java
```
- **Run**:
```bash
java Demo4
```

## Example
- **Input**:
```
Enter the number of chapters: 10
```
- **Output**:
```
The cost is: 3.0
```


