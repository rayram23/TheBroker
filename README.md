# TheBroker
An easier way to work with RabbitMq. Sending a single message to through RabbitMq should not be a 
complicated task. Sending multiple messages with relatively high throughput should be something handled by the client and not something the user of the library should be concerned with. Conversely a message that is being processed from RabbitMq should be able to acknowledge at a later time in a simple way, rather than maintaining information about the message and proper acking. 
