# Challenge Summary

Create a class called AnimalShelter which holds only dogs and cats.<br />
The shelter operates using a first-in, first-out approach.<br />
Implement the following methods:<br />
enqueue<br />
Arguments: animal<br />
animal can be either a dog or a cat object.<br />
dequeue<br />
Arguments: pref<br />
pref can be either "dog" or "cat"<br />
Return: either a dog or a cat, based on preference.<br />
If pref is not "dog" or "cat" then return null.<br />

## Whiteboard Process
![image](image2.png)

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