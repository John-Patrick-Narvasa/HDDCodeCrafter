# while loop

# help (insert prints)

# with conditions
    #if help (print following)
    #elif start (print following)
    #elif stop (print following)
    #elif quit (BREAK LOOP)
    #else (i dont know what to do)
started = False
stopped = False
   
while True:
    user_input = input("help/start/stop/quit").lower()

    if user_input == "help":
        print("""
start - to start the car
stop - to stop the car
quit - to exit
              """)
    elif user_input == "start":
        print("start")
        if started:
            print("car is already started")
    elif user_input == "car started":
        print("stop")
        if stopped:
            print("car is already stopped")
    elif user_input == "car stopped":
        print("quit")
        break
    else:
        print("i dont know what to do")

