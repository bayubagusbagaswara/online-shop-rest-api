# Pharmacy Store REST API

# generate keypair.pem
openssl genrsa -out keypair.pem 2048

# generate public.pem
openssl rsa -in keypair.pem -pubout -out public.pem

# generate private.pem
openssl pkcs8 -topk8 -inform PEM -outform PEM -nocrypt -in keypair.pem -out private.pem

- JWT Symmetric Key

1. Laporan buat pemilik toko nya, artinya hanya mempedulikan product dan order yang keluar, tidak mempedulikan customer nya siapa
2. Laporan buat customer, artinya khusus untuk customer tersebut membeli apa saja (spesifik masing-masing customer)

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