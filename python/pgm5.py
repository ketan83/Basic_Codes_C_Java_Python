
'''
 var1 =0             #equality & inequality operators
print(var1 != 0)
var1 =1 
print(var1 != 0)

x = int(input("Enter the number you want to enter : "))
print(x<=100)


# read two numbers                                        IF ELSE STATEMENT ..............
number1 = int(input("Enter the first number: "))
number2 = int(input("Enter the second number: "))

# choose the larger number
if number1 > number2:
    larger_number = number1
else:
    larger_number = number2

# print the result
print("The larger number is:", larger_number)



x = int(input("ENter value in x"))                                  IF ELIF ELSE STMT..................
y = int(input("ENter value in y"))
z = int(input("ENter value in z"))

if(x>y):
    print(x," is greater no.")
elif(y>z):
    print(y," is greater no.")
elif(x>z):
    print(x," is greater no.")
else:
    print(z," is greater no.")
    

x =input("Enter a plant name")
if(x == "Spathiphyllum"):
    print(x+"is the best pllant ever!")
else:
    print(x+"! Not pelargonium!")


n1= int(input("ENter the firt number"))                                         WHILE LOOP EG.............
n2= int(input("ENter the last number"))
while(n1<=n2):
    if(n1%2==0):
        print("Even = ",n1)
    else:
        print("Odd = ",n1)
    n1+=1
    print("Thank You 💛️")
    

import time                                                                     FOR LOOP .......................

# Write a for loop that counts to five.
    # Body of the loop - print the loop iteration number and the word "Mississippi".
    # Body of the loop - use: time.sleep(1)

# Write a print function with the final message.
i=1
for i in range(6):
    print(i,"Mississipi \n")
    i+=1


print("Ready or not, here I come")


# break - example



print("The break instruction:")                             BREAK STMT.......................................

for i in range(1, 6):

    if i == 3:

        break

    print("Inside the loop.", i)

print("Outside the loop.")





# continue - example



print("\nThe continue instruction:")        CONTINUE STMT.............................

for i in range(1, 6):

    if i == 3:

        continue

    print("Inside the loop.", i)

print("Outside the loop.")

blocks = int(input("Enter number of blocks: "))           TO MEASURE HEIGHT OF THE BLOCK .............

for i in range(blocks + 1):
    for j in range(blocks + 1):
                    height = j / 2
if height % 2 == 0:
                    height = height / 2

print(f"The height of the pyramid: {height}")
'''
x =int(input("Enter no"))

while(x!=17):
    if(x%2==0):
            x = x + 2
            print(x)
    else:
            x = 3 * x + 1
            print(x)
    x+=1


