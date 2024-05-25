# README

You should see the following:

```bash
======================== Running safeNavigationExamples ========================
safeCall: testA
chainedSafeElvis: testA
elvis: Null found
chainedSafeElvis: Null found
======================== Running loopExamples ========================
value found breaking to labeled point
value found breaking to out loop
outer break required
======================== Running functionExamples ========================
exampleA: Unit is Void-like
exampleB: I am returned
exampleC: I am not returned
blockCall
======================== Running arrayAndListExamples ========================
numArr: 1
numArr: 2
numArr: 3
numArr: 4
numList: 1
numList: 2
numList: 3
numList: 4
numList: 5
findInList: 3 found
findInList: no match found
======================== Running classExamples ========================
stringVariable: exampleA.stringVariable2, stringValue: I'm set already as a val
stringVariable: , stringValue: I'm set already as a val
stringVariable: exampleB.stringVariable, stringValue: exampleB.stringValue
stringVariable: exampleC.stringVariable, stringValue: exampleC.stringValue
stringVariable: exampleC.stringVariable, stringValue: exampleC.stringValue, additionalStringVariable: exampleC.additionalStringVariable
stringVariable: exampleC.stringVariable, stringValue: exampleC.stringValue, additionalStringVariable: exampleC.additionalStringVariable, additionalStringValue: exampleD.additionalStringValue
======================== Running interfacesExamples ========================
I'm printing both textVal and textVar
I'm printing textVal
I'm printing textVar
======================== Running comparisonExamples ========================
a == a
null == null
a == a
null == null
Array A has the same elements as Array B
======================== Running enumExamples ========================
Iterating Through EnumExample:
A
B
C
Iterating Through ParameterizedEnumExample:
AA
BB
CC
ParameterizedEnumExample.valueOf(): A
ParameterizedEnumExample.A.name: A
EnumExample.valueOf(): A
EnumExample.A.name: A
======================== Running asynchronousExamples ========================
I'm in the blocking scope
I'm in a coroutine
I'm in the returned suspended function with exampleA
I'm awaited at resultA: I'm done: exampleA
I'm in the returned suspended function with exampleB
I'm in the returned suspended function with exampleC
I'm composed: I'm done: exampleA, I'm done: exampleB, I'm done: exampleC
Channel received: 1
Channel received: 2
Channel received: 3
I'm in the suspended function with no return: exampleD
Channel received: 4
Channel received: 5
Channel received: 6
Channel received: 7
Channel received: 8
Channel received: 9
Channel received: 10
```