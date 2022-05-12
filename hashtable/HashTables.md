# Hashtables
some type of sort  in array that create link list inside of  array  and hashing the key to check the place of the value <br />
## Challenge
set<br />
Arguments: key, value<br />
Returns: nothing<br />
This method should hash the key, and set the key and value pair in the table, handling collisions as needed.<br />
Should a given key already exist, replace its value from the value argument given to this method.<br />
get<br />
Arguments: key<br />
Returns: Value associated with that key in the table<br />
contains<br />
Arguments: key<br />
Returns: Boolean, indicating if the key exists in the table already.<br />
keys<br />
Returns: Collection of keys<br />
hash<br />
Arguments: key<br />
Returns: Index in the collection for that key<br />

## Approach & Efficiency
set<br />
o(n)for space<br /> 
O(1)for time<br />

get<br />
o(n)for space<br />
O(n)for time<br />

contains<br />
o(n)for space and time<br />

keys<br />
O(1) for space and time <br />

hash<br />
O(1)for space and time<br />
## API
set<br />
method that is save the new hash node in the number we hashing it  in array<br />

get<br />
method that is give it key and we will return the value for the key<br />

contains<br />
check if the array contain the value in same place we have it in key<br />

keys<br />
save the key inside array and show it<br />

hash<br />
hashing the number we have it to return the index of the place <br />







