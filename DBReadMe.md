    /**
     * Schema PWMB -> Main Package - com.paywithmybank.merchantgateway.db.model;
     *
     *  - DBMerchant -> PWMB_MERCHANTS -> Merchant Table -> Name (Merchant Id)
     *  - DBCustomer -> PWMB_CUSTOMER -> Customer Table -> Name (Merchant Id) -> Alias CCN ------> Search Merchant Client Name
     *  - DBTransaction -> PWMB_TRANSACTIONS -> Merchant Transactions Table -> Alias T
     *  - DBPayment -> PWMB_PAYMENTS - PWMB Payments Table -> alias P -----> Search Account Name
     *
     * Schema FIGTW -> com.paywithmybank.figateway.db.model;
     *
     *  - DBTransaction -> FIGTW_TRANSACTIONS -> Financial Transactions Table -> Alias FT
     *  - DBFISessionCustomer -> FIGTW_FI_SESSION_CUST -> XXXXX -> Alias FTC
     *  - DBFISessionCustomerName -> FIGTW_FI_SESSION_CUST_NAME -> Alias FTCN ------> Search Financial Client Name
     *
     * Joins
     *
     *  - DBTransaction (PWMB_TRANSACTIONS) x DBTransaction(FIGTW_TRANSACTIONS) -> t.pp_trx_id = ft.ext_trans_id
     *  - DBTransaction (FIGTW_TRANSACTIONS) x DBFISessionCustomer -> FT.SESSION_ID = FTC.SESSION_ID
     *  - DBFISessionCustomer x DBFISessionCustomerName -> FTC.FI_SESSION_CUST_ID = FTCN.PARENT_ID
     *  - DBCustomer x DBPayment = ccn.customer_id = p.customer_i*
     *
     * @param mctCustomerName -> Front End -> CUSTOMER_NAME
     * @param customerName -> //Front End -> FI_CUSTOMER_NAME
     */