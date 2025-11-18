# Demo4 - Expressions Calculator / حاسبة التعبيرات

## Overview / نظرة عامة

**English**: This program calculates two expressions:
- e1 = ((a + b) * (c * a + (a * a)) – b * b) / (( c + d) * (c - d))
- e2 = x + y % z * 5 – y

**العربية**: هذا البرنامج يحسب تعبيرين:
- e1 = ((a + b) * (c * a + (a * a)) – b * b) / (( c + d) * (c - d))
- e2 = x + y % z * 5 – y

---

## Commands / الأوامر

### Compile / الترجمة

**English:**
```bash
javac demo4.java
```

**العربية:**
```bash
javac demo4.java
```

### Run / التشغيل

**English:**
```bash
java demo4
```

**العربية:**
```bash
java demo4
```

---

## Example Usage / مثال الاستخدام

**English:**

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

**العربية:**

**المدخلات:**
```
Enter a: 2.5
Enter b: 3.0
Enter c: 4.0
Enter d: 1.0
Enter x: 10
Enter y: 15
Enter z: 4
```

**النتيجة:**
```
e1 = 4.833333333333333
e2 = 1
```

---

## Notes / ملاحظات

**English**: 
- Variables a, b, c, d, e1 are declared as `double`
- Variables x, y, z, e2 are declared as `int`
- Make sure d is not zero and (c + d) * (c - d) is not zero to avoid division by zero error

**العربية**:
- المتغيرات a, b, c, d, e1 معرفة كـ `double`
- المتغيرات x, y, z, e2 معرفة كـ `int`
- تأكد من أن d ليس صفراً و (c + d) * (c - d) ليس صفراً لتجنب خطأ القسمة على صفر

