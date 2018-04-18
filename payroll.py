import time
import datetime
from tkinter import*
import tkinter.messagebox as box

root=Tk()
root.title("GURGAON CARZ")
root.geometry('1350x650')

#                       FRAME               #
abc1=Frame(root,width=1350,height=50,bd=8,relief="raise")
abc1.pack(side=TOP)
f1=Frame(root,width=600,height=600,bd=8, relief="raise")
f1.pack(side=LEFT)

f2=Frame(root,width=300,height=700,bd=8, relief="raise")
f2.pack(side=RIGHT)

fla=Frame(f1,width=600,height=200,bd=20,relief="raise")
fla.pack(side=TOP)

flb=Frame(f1,width=600,height=200,bd=20,relief="raise")
flb.pack(side=TOP)

#                       LABEL                       #
info=Label(abc1,font=('arial',60,'bold'),text="       GURGAON CARZ       ",bd=10)
info.grid(row=0,column=0)
info_name=Label(fla,text="NAME",font=('arial',16,'bold'),bd=20).grid(row=0,column=0)
info_address=Label(fla,text="ADDRESS",font=('arial',16,'bold'),bd=20).grid(row=0,column=2)
info_employer=Label(fla,text="EMPLOYER",font=('arial',16,'bold'),bd=20).grid(row=1,column=0)
info_ninumber=Label(fla,text="VEHICLE NUMBER",font=('arial',16,'bold'),bd=20).grid(row=1,column=2)
info_hoursworked=Label(fla,text="HOURS WORKED",font=('arial',16,'bold'),bd=20).grid(row=2,column=0)
info_hourlyrate=Label(fla,text="HOURLY RATE",font=('arial',16,'bold'),bd=20).grid(row=2,column=2)
info_tax=Label(fla,text="TAX",font=('arial',16,'bold'),bd=20,anchor='w').grid(row=3,column=0)
info_overtime=Label(fla,text="OVERTIME",font=('arial',16,'bold'),bd=20).grid(row=3,column=2)
info_grosspay=Label(fla,text="GROSS PAY",font=('arial',16,'bold'),bd=20).grid(row=4,column=0)
info_netpay=Label(fla,text="NET PAY",font=('arial',16,'bold'),bd=20).grid(row=4,column=2)

#                   BUTTON FUNCTION                 #
def iExit():
    ex = box.askyesno("GURGAON CARZ", "DO YOU WANT TO EXIT SYSTEM?")
    if ex > 0:
        root.destroy()
        return
def reset():
    NAME.set("")
    ADDRESS.set("")
    EMPLOYER.set("")
    NINUMBER.set("")
    HOURSWORKED.set("")
    HOURLYRATE.set("")
    TAX.set("")
    OVERTIME.set("")
    GROSSPAY.set("")
    NETPAY.set("")

def payslip():
    txtpayslip.insert(END,"\t\tPAY SLIP\n\n")
    txtpayslip.insert(END,"NAME:\t\t"+NAME.get()+"\n\n")
    txtpayslip.insert(END,"ADDRESS:\t\t"+ADDRESS.get()+"\n\n")
    txtpayslip.insert(END,"VEHICLENUMBER:\t\t"+NINUMBER.get()+"\n\n")
    txtpayslip.insert(END,"HOURSWORKED:\t\t"+HOURSWORKED.get()+"\n\n")
    txtpayslip.insert(END,"HOURLYRATE:\t\t"+HOURLYRATE.get()+"\n\n")
    txtpayslip.insert(END,"TAX:\t\t"+TAX.get()+"\n\n")
    txtpayslip.insert(END,"OVERTIME:\t\t"+OVERTIME.get()+"\n\n")
    txtpayslip.insert(END,"GROSS PAY:\t\t"+GROSSPAY.get()+"\n\n")
    txtpayslip.insert(END,"NET PAY:\t\t"+NETPAY.get()+"\n\n")

def weeklywage():
    hourwork=float(HOURSWORKED.get())
    wageperhour=float(HOURLYRATE.get())

    pay=hourwork * wageperhour
    payment="Rs",str('%.2f'%(pay))
    GROSSPAY.set(payment)

    tax=pay*0.2
    taxes="Rs",str('%.2f'%(tax))
    TAX.set(taxes)

    netpay=pay-tax
    netpayment="Rs",str('%.2f'%(netpay))
    NETPAY.set(netpayment)

    if hourwork>40:
        overtimehour=(hourwork-40)+wageperhour*1.5
        overtimes="Rs",str('%.2f'%(overtimehour))
        OVERTIME.set(overtimehour)
    elif hourwork<=40:
        overtimehour=(hourwork-40)+wageperhour*2.5
        overtimes="Rs",str('%.2f'%(overtimehour))
        OVERTIME.set(overtimehour)

#               VARIABLE USED               #
NAME=StringVar()
ADDRESS=StringVar()
EMPLOYER=StringVar()
NINUMBER=StringVar()
HOURSWORKED=StringVar()
HOURLYRATE=StringVar()
TAX=StringVar()
OVERTIME=StringVar()
GROSSPAY=StringVar()
NETPAY=StringVar()
TIMEOFORDER=StringVar()
DATEOFORDER=StringVar()
DATEOFORDER.set(time.strftime("%d/%m/%Y"))

#                   ADJUSTMENT                  #
name_name=Entry(fla,textvariable=NAME,font=('arial',16,'bold'),bd=16,bg="lightblue", width=22, justify='left')
name_name.grid(row=0,column=1)

name_address=Entry(fla,textvariable=ADDRESS,font=('arial',16,'bold'),bd=16,bg="lightblue", width=22, justify='left')
name_address.grid(row=0,column=3)

name_employer=Entry(fla,textvariable=EMPLOYER,font=('arial',16,'bold'),bd=16,bg="lightblue", width=22, justify='left')
name_employer.grid(row=1,column=1)

name_ninumber=Entry(fla,textvariable=NINUMBER,font=('arial',16,'bold'),bd=16,bg="lightblue", width=22, justify='left')
name_ninumber.grid(row=1,column=3)

name_hw=Entry(fla,textvariable=HOURSWORKED,font=('arial',16,'bold'),bd=16,bg="lightblue", width=22, justify='left')
name_hw.grid(row=2,column=1)

name_hr=Entry(fla,textvariable=HOURLYRATE,font=('arial',16,'bold'),bd=16,bg="lightblue", width=22, justify='left')
name_hr.grid(row=2,column=3)

name_tax=Entry(fla,textvariable=TAX,font=('arial',16,'bold'),bd=16, width=22,bg="lightblue", justify='left')
name_tax.grid(row=3,column=1)

name_overtime=Entry(fla,textvariable=OVERTIME,font=('arial',16,'bold'),bd=16,bg="lightblue", width=22, justify='left')
name_overtime.grid(row=3,column=3)

name_gp=Entry(fla,textvariable=GROSSPAY,font=('arial',16,'bold'),bd=16, width=22,bg="lightblue", justify='left')
name_gp.grid(row=4,column=1)

name_np=Entry(fla,textvariable=NETPAY,font=('arial',16,'bold'),bd=16, width=22,bg="lightblue", justify='left')
name_np.grid(row=4,column=3)

#               PAYSLIP AREA                #
lblpayslip=Label(f2,font=('arial',20,'bold'),textvariable=DATEOFORDER).grid(row=0,column=0)

txtpayslip=Text(f2,height=22,width=34,bd=16,font=('arial',12,'bold'))
txtpayslip.grid(row=1,column=0)


#                   BUTTONS             #
btnsalary=Button(flb,text='WEEKELY SALARY',padx=16,pady=16,bd=8,fg="black",font=('arial',16,'bold'),
                 width=14,height=1,command=weeklywage).grid(row=0,column=0)
btnreset=Button(flb,text='RESET',padx=16,pady=16,bd=8,fg="black",font=('arial',16,'bold'),
                 width=14,height=1,command=reset).grid(row=0,column=1)
btnpayslip=Button(flb,text='VIEW PAYSLIP',padx=16,pady=16,bd=8,fg="black",font=('arial',16,'bold'),
                 width=14,height=1,command=payslip).grid(row=0,column=2)
btnexit=Button(flb,text='EXIT',padx=16,pady=16,bd=8,fg="black",font=('arial',16,'bold'),
                 width=14,height=1,command=iExit).grid(row=0,column=3)


root.mainloop()
