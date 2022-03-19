# Challenge Summary
Create a new class called pseudo queue.<br />
Do not use an existing Queue.<br />
Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below),<br />
Internally, utilize 2 Stack instances to create and manage the queue<br />
Methods:<br />
enqueue<br />
Arguments: value<br />
Inserts value into the PseudoQueue, using a first-in, first-out approach.<br />
dequeue<br />
Arguments: none<br />
Extracts a value from the PseudoQueue, using a first-in, first-out approach.h<br />

## Whiteboard Process
![image](image.png)

## Approach & Efficiency
enQueue method
O(n)for Space and time
deQueue
O(1)for space and time

## Solution
enQueue
Output:
[5]->[10]->[15]->[20]
Input:
[10]->[15]->[20]
deQueue
Output:
[5]->[10]
Input:
[5]->[10]->[15]