'''
beatles = []
print("Step 1:", beatles)
beatles.append("John lennon ")
beatles.append("Paul McCartney ")  
beatles.append("George Harrison ")

print("Step 2:", beatles)
for i in range(1,2):

    x = input("Enter member name 1 of other  of rock band")

    y = input("Enter member name 2 of other  of rock band")

    beatles.append(x)

    beatles.append(y)

print("Step 3:", beatles)
del beatles[2]
del beatles[3]
print("Step 4:", beatles)
beatles.insert(5,"Ringo Starr")

print("Step 5:", beatles)

# testing list legth
print("The Fab", len(beatles))



m = [8 ,10,6,2,4]

length = len(m)

for i in range(0,length-1):                        # BUBBLE SORT ALGORITHM CODE USING FOR LOOP ...........................
    for j in range(0,length-1-i):
        if(m[j]>m[j+1]):
            m[j],m[j+1] = m[j+1],m[j]

print(m)
myList = [8, 10, 6, 2, 4] # list to sort                                     # ANOTHER APPROACH TO WRITE BUBBLE SORT ALGORITHM CODE  
swapped = True # it's a little fake - we need it to enter the while loop

while swapped:
    swapped = False # no swaps so far
    for i in range(len(myList) - 1):
        if myList[i] > myList[i + 1]:
            swapped = True # swap occured!
            myList[i], myList[i + 1] = myList[i + 1], myList[i]

print(myList)

m = [ 14 , 19 , 16 , 11 ,20]                                      # IF YOU WANT PYTHON TO SORT THE LIST YOU CAN DO IT LIKE THIS AS PYHTON ALREADY HAS READY-TO-USE TOOLS ......................

m.sort()

print(m)
'''

'''
lst = [5, 3, 1, 2, 4]                                  # TO SORT THE ELEMENTS IN REVERSE ORDER ...................                                                                 
print(lst)

lst.reverse()
print(lst) # outputs: [4, 2, 1, 3, 5]


                                                                # TWO POWERFUL OPERATORS IN PYTHON3 ARE NOT IN & IN OPERATORS
lst = [ 5, 9 ,16 ,18]

print(5 in lst)

print(21 in lst)

print(9 not in lst)
'''

'''
mylist = [1, 2, 4, 4, 1, 4, 2, 6, 2, 9]
print(mylist)
print(len(mylist))



del mylist[2]

del mylist[4]

del mylist[5]

del mylist[6]

#del mylist[7]

#del mylist[9]
print(mylist)
print(len(mylist))

'''
m = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]                                     #TO FIND AN ELEMENT FROMM THE LIST ....................
x = int(input("Enter no. which you want to find in the given list"))
for i in range(0,len(m)):
    y = m[i]==x
    if y:
        break

if y:
    print("Element found at index" , i)
else:
    print("absent")


    l1 = ["A", "B", "C"]
l2 = l1
l3 = l2

del l1[0]
del l2[0]

print(l3)


l1 = ["A", "B", "C"]
l2 = l1
l3 = l2

del l1[0]
del l2

print(l3)


l1 = ["A", "B", "C"]
l2 = l1
l3 = l2

del l1[0]
del l2[:]

print(l3)


l1 = ["A", "B", "C"]
l2 = l1[:]
l3 = l2[:]

del l1[0]
del l2[0]

print(l3)



myList = [1, 2, "in", True, "ABC"]

print(1 ??? myList) # outputs True
print("A" ??? myList) # outputs True
print(3 ??? myList) # outputs True
print(False ??? myList) # outputs False
