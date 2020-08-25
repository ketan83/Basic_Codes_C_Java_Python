temps = [[2.0 for h in range(24)] for d in range(31)]
#
# the matrix is magically updated here
#

total = 0.0

for day in temps:
    total += day[11]

average = total / 31

print("Average temperature at noon:", average)


#Now find the highest temperature during the whole month - see the code:

temps = [[0.0 for h in range(24)] for d in range(31)]
#
# the matrix is magically updated here
#

highest = -100.0

for day in temps:
    for temp in day:
        if temp > highest:
            highest = temp

print("The highest temperature was:", highest)


#Note:

#the day variable iterates through all the rows in the temps matrix;
#the temp variable iterates through all the measurements taken in one day.
#Now count the days when the temperature at noon was at least 20 ℃:

temps = [[0.0 for h in range(24)] for d in range(31)]
#
# the matrix is magically updated here
#

hotDays = 0

for day in temps:
    if day[11] > 20.0:
        hotDays += 1

print(hotDays, "days were hot.")
