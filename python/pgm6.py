'''
#PROGRAM TO REMOVE VOWELS FROM THE STRING INPUTTED BY USER

string = input("Enter any string: ")
if string == 'x':
    exit();
else:
    newstr = string;
    print("\nRemoving vowels from the given string");
    vowels = ('a', 'e', 'i', 'o', 'u');
    for x in string.upper():                                #UPPER() IS USED TO MAKE LETTERS OF THE WORD IN  CAPITAL FORM
        if x in vowels:
            newstr = newstr.replace(x,"");
    print("New string after successfully removed all the vowels:");
    print(newstr);
    
********************************************************************************8888
numbers = [10, 5, 7, 2, 1]

print("Original list content:", numbers) # printing original list content



numbers[0] = 111

print("\nPrevious list content:", numbers) # printing previous list content



numbers[1] = numbers[4] # copying value of the fifth element to the second

print("Previous list content:", numbers) # printing previous list content



print("\nList length:", len(numbers)) # printing the list's length

del numbers[1] # removing the second element from the list

print("New list's length:", len(numbers)) # printing new list length

print("\nNew list content:", numbers) # printing current list content

numbers = [111, 7, 2, 1]

print(numbers[-1])              #Negative indices is legal

print(numbers[-2])



hatList = [1, 2, 3, 4, 5]  # This is an existing list of numbers hidden in the hat.



# Step 1: write a line of code that prompts the user

# to replace the middle number with an integer number entered by the user.



# Step 2: write a line of code here that removes the last element from the list.



# Step 3: write a line of code here that prints the length of the existing list.

x = int(input("Enter a number whivhh you want to replace"))

hatList[2]=x



print("Original List Content:",hatList)

print("Original List Content length:",len(hatList))



print(" List Content after replacing middle element no.:",hatList)



del hatList[4]

print(" List Content after deleting last element no.:",hatList)

print(" List Content after replacing middle element & removing last element:",hatList)
print("Original List Content length:",len(hatList))


# ADDING ELEMENTS IN THE LIST  APPEND(VALUE) & INSERT(LOCATION , VALUE )....................................................................

numbers = [111, 7, 2, 1]

print(len(numbers))

print(numbers)



###



numbers.append(4)



print(len(numbers))

print(numbers)



###



numbers.insert(0, 222)

print(len(numbers))

print(numbers)



#   ADDING ELEMENTS IN THE LIST IN THE ANOTHER WAY ...........................................................

mlist = [] 

for i in range(5):
    mlist.insert(1,i+1)

print(mlist)


mlist = [] 

for i in range(5):
    mlist.append(1)

print(mlist)
'''

# SWAPPING OF ELEMENTS OF LISTS

m = [ 77 ,78 , 79 ,80 ,81]

m[0] , m[1] = m[1] , m[0]
m[2] , m[3] = m[3] , m[2]

print(len(m))
print(m)


myList = [10, 1, 8, 3, 5]
length = len(myList)

for i in range(length // 2):
    myList[i], myList[length - i - 1] = myList[length - i - 1], myList[i]

print(myList)

