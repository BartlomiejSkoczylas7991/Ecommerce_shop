import { Address } from "./address";
import { Customer } from "./customer";
import { Order } from "./order";
import { OrderItem } from "./order-item";

export class Purchase {
    customer: Customer;
    shippingAddress: Address;
    billingAddress;
    order: Order;
    orderItems: OrderItem[];
    
}
