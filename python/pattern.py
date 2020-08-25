from emoji import emojize 
for i in range(6):
    for j in range(7):
        if(i==0 and j%3!=0 or i==1 and j%3 == 0):
                            print(emojize("💛️"),end=" ")    
        elif(i-j==2 or i+j==8):
                            print(emojize("💛️"),end=" ") 
        else:
                            print(end="   ")

print()
