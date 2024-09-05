# README

You should see the following:

```bash
kotlin-1  | ======================== Running safeNavigationExamples ========================
kotlin-1  | safeCall: testA
kotlin-1  | chainedSafeElvis: testA
kotlin-1  | elvis: Null found
kotlin-1  | chainedSafeElvis: Null found
kotlin-1  | nullableExample: Null assigned to String
kotlin-1  | ======================== Running loopExamples ========================
kotlin-1  | value found breaking to labeled point
kotlin-1  | value found breaking to out loop
kotlin-1  | outer break required
kotlin-1  | ======================== Running functionExamples ========================
kotlin-1  | exampleA: Unit is Void-like
kotlin-1  | exampleB: I am returned
kotlin-1  | exampleC: I am not returned
kotlin-1  | blockCall
kotlin-1  | ======================== Running arrayAndListExamples ========================
kotlin-1  | numArr: 1
kotlin-1  | numArr: 2
kotlin-1  | numArr: 3
kotlin-1  | numArr: 4
kotlin-1  | numList: 1
kotlin-1  | numList: 2
kotlin-1  | numList: 3
kotlin-1  | numList: 4
kotlin-1  | numList: 5
kotlin-1  | findInList: 3 found
kotlin-1  | findInList: no match found
kotlin-1  | ======================== Running classExamples ========================
kotlin-1  | stringVariable: exampleA.stringVariable2, stringValue: I'm set already as a val
kotlin-1  | stringVariable: , stringValue: I'm set already as a val
kotlin-1  | stringVariable: exampleB.stringVariable, stringValue: exampleB.stringValue
kotlin-1  | stringVariable: exampleC.stringVariable, stringValue: exampleC.stringValue
kotlin-1  | stringVariable: exampleC.stringVariable, stringValue: exampleC.stringValue, additionalStringVariable: exampleC.additionalStringVariable
kotlin-1  | stringVariable: exampleC.stringVariable, stringValue: exampleC.stringValue, additionalStringVariable: exampleC.additionalStringVariable, additionalStringValue: exampleD.additionalStringValue
kotlin-1  | ======================== Running interfacesExamples ========================
kotlin-1  | I'm printing both textVal and textVar
kotlin-1  | I'm printing textVal
kotlin-1  | I'm printing textVar
kotlin-1  | ======================== Running comparisonExamples ========================
kotlin-1  | a == a
kotlin-1  | null == null
kotlin-1  | a == a
kotlin-1  | null == null
kotlin-1  | Array A has the same elements as Array B
kotlin-1  | ======================== Running enumExamples ========================
kotlin-1  | Iterating Through EnumExample:
kotlin-1  | A
kotlin-1  | B
kotlin-1  | C
kotlin-1  | Iterating Through ParameterizedEnumExample:
kotlin-1  | AA
kotlin-1  | BB
kotlin-1  | CC
kotlin-1  | ParameterizedEnumExample.valueOf(): A
kotlin-1  | ParameterizedEnumExample.A.name: A
kotlin-1  | EnumExample.valueOf(): A
kotlin-1  | EnumExample.A.name: A
kotlin-1  | ======================== Running abstractClassesExamples ========================
kotlin-1  | stringVariable: ExampleConcreteClass.stringVariableA, stringValue: ExampleConcreteClass.stringValue
kotlin-1  | stringVariableB: stringVariableB - I'm initialized!, stringVariableC: ExampleConcreteClass.stringVariableC
kotlin-1  | ======================== Running lazyInitializationExamples ========================
kotlin-1  | exampleA - I'm initialized with My initialization comment
kotlin-1  | exampleA - I'm initialized with My initialization comment
kotlin-1  | exampleB - I'm initialized with I'm initialized
kotlin-1  | ======================== Running asynchronousExamples ========================
kotlin-1  | I'm in the blocking scope
kotlin-1  | I'm in a coroutine
kotlin-1  | I'm in the returned suspended function with exampleA
kotlin-1  | I'm awaited at resultA: I'm done: exampleA
kotlin-1  | I'm in the returned suspended function with exampleB
kotlin-1  | I'm in the returned suspended function with exampleC
kotlin-1  | I'm composed: I'm done: exampleA, I'm done: exampleB, I'm done: exampleC
kotlin-1  | Channel received: 1
kotlin-1  | I'm in the suspended function with no return: exampleD
kotlin-1  | Channel received: 2
kotlin-1  | Channel received: 3
kotlin-1  | Channel received: 4
kotlin-1  | Channel received: 5
kotlin-1  | Channel received: 6
kotlin-1  | Channel received: 7
kotlin-1  | Channel received: 8
kotlin-1  | Channel received: 9
kotlin-1  | Channel received: 10
```