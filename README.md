# Pharmacy Store REST API

# generate keypair.pem
openssl genrsa -out keypair.pem 2048

# generate public.pem
openssl rsa -in keypair.pem -pubout -out public.pem

# generate private.pem
openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem

- JWT Symmetric Key

# Registration

1. User mendaftar dengan memasukkan nama, email dan password
2. Response nya bisa berupa String, "Registration is successfully" atau "Registration failed, email already taken", atau "Username is already taken"
3. Lalu jika success, maka kita juga mengirimkan link verifikasi ke email user
4. Biasanya link url di email tersebut berisi token juga atau URL untuk mengarah ke halaman login

# Login

1. User akan memasukkan username dan password
2. Lalu dicek apakah berhasil terautentikasi atau gagal
3. Jika gagal, maka kirim response "Username dan password tidak ditemukan"
4. Jika success, maka kirimkan token 

# User (Customer)

# Product
- Name
- Price
- Quantity (stock)

# Order Detail
- Product
- Order
- Quantity
- Price

Sample : Product = iPhone, Quantity = 4, Price = 5.000.000

# Order
- Total Price
- Date

Sample : Total Price = 20.000.000, Date = 24 July 2023

Total price diambil dari table Order Detail,


# Wishlist

- Customer
- Product
- Quantity

# Query
- Fulltext search