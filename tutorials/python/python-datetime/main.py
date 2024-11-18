import datetime

current_date_and_time = datetime.datetime.now() # retrieve current date and time
print(current_date_and_time) # print current date_time: 2024-11-15 23:42:26.342788


x = datetime.datetime.now() # it stores date time (including milliseconds)

print("Year in full form: ", x.strftime("%Y")) # output full form year: 2024
print("Year in short form: ", x.strftime("%y")) # output year in short form: 24
print("Month in full form: ", x.strftime("%B")) # output month name: November
print("Weekday in full form: ", x.strftime("%A")) # output weekday name: Friday
print("Weekday number, in the year: ", x.strftime("%W")) # output running weekday number: 46
print("Print timezone: ", x.strftime("%c")) # print full date and time of the local format


date = datetime.datetime.now().date() # print date only
print(date) # 2024-11-16

time = datetime.datetime.now().time() # print time only
print(time)