class Bank:
    def __init__(self, user_name, pin, balance):
        self.user_name = user_name
        self.pin = pin
        self.balance=balance
        print(f"Welcome, {self.user_name}")
        operation = int(input("Enter 1 for checking balance, 2 for depositing and 3 for withdrawing\n"))
        pin = int(input("Enter your pin\n"))
        if(operation==1):
            self.check_balance(pin)
        elif(operation==2):
            amount = int(input("Enter the amount you wanna deposit\n"))
            self.deposit(amount, pin)
        elif(operation==3):
            amount = int(input("Enter the amount you wanna withdraw\n"))
            self.withdrawal(amount, pin)
        else:
            print("Invalid input")
    def check_balance(self, pin):
        if(self.pin==pin):
            print(f"Your current account balance is {self.balance}")
        else:
            print("Incorrect pin")
        return
    def deposit(self, amount, pin):
        if(self.pin==pin):
            self.balance += amount
            print(f"Amount {amount} has been credited to your account")
            print(f"Your current account balance is {self.balance}")
        else:
            print("Incorrect pin")
        return 
    def withdrawal(self, amount, pin):
        if(self.pin==pin):
            if(amount <= self.balance):
                self.balance -= amount
                print(f"Amount {amount} has been withdrawn from your account successfully")
            else:
                print(f"Insufficient funds to withdraw this amount")
            print(f"Your current account balance is {self.balance}")
        else:
            print("Incorrect pin")
        return 
acc1 = Bank("Alex", 6060, 27500)
