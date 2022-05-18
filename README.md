# TestTask
## Scennshots - Basics Functional of the Project 
PostgreSQL 11 DB:
![image](https://user-images.githubusercontent.com/94168628/169008563-b4acaff7-71cc-4c28-b1c2-0e3288e184b6.png)

Register 
![image](https://user-images.githubusercontent.com/94168628/169009128-472e4491-e55f-4946-8222-1451fb5ba24f.png)

Login 
![image](https://user-images.githubusercontent.com/94168628/169009151-c44cc2dd-487d-42e2-b76b-3819a564623b.png)

Create Order
![image](https://user-images.githubusercontent.com/94168628/169009099-145f1b2a-ff5e-479d-a03a-3cb5ab1c467f.png)

Get Order
![image](https://user-images.githubusercontent.com/94168628/169009072-791f2b24-f459-4f9b-b462-e0443b39ff3f.png)

## Postman requests  
http://localhost:8093/orders/create  - create user 
body example :
{
   "orderId":1,
   "orderName": "Iphone 12",
   "orderN": 2,
   "addressTo":"Pavlodar",
   "phoneNumber":"87078620198"
}
http://localhost:8093/orders/list  - get user (list) 

