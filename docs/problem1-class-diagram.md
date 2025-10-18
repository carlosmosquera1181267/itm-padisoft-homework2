```mermaid
classDiagram
        class PaypalAPI {
            -double amount
            -string currency
            +boolean charge()
        }
        class StripeAPI {
            -string id
            -double amount
            -string currency
            +bool processPayment()
        }
        class MercadoPagoAPI {
            -double amount
            -string currency
            -string id
            +pay()
        }
        class PaymentProcessor {
            <<interface>>
            +boolean process(double amount, string currency)
        }
        class PaypalAdapter {
            -PaypalAPI api
            +boolean process(double amount, string currency)
        }
        class StripeAdapter {
            -StripeAPI api
            +boolean process(double amount, string currency)
        }
        class MercadoPagoAdapter {
            -MercadoPagoAPI api
            +boolean process(double amount, string currency)
        }
        PaymentProcessor <|-- PaypalAdapter
        PaymentProcessor <|-- StripeAdapter
        PaymentProcessor <|-- MercadoPagoAdapter

        PaypalAdapter --> PaypalAPI
        StripeAdapter --> StripeAPI
        MercadoPagoAdapter --> MercadoPagoAPI

        class ECommercePlatform {
            -PaymentProcessor processor
            +void setPaymentProcessor(PaymentProcessor p)
            +void checkout(double total, string currency)
        }
        ECommercePlatform --> PaymentProcessor
