package mqtt;


public class MQTTMain {
   /* public static void main(String[] args){
        MyMQTTMessageHandler myMessageHandler = new MyMQTTMessageHandler();
        MqttGateway myMqttGateway =  new MqttGatewayImpl("192.168.203.232", "GatewayName", myMessageHandler);
        myMqttGateway.startMqtt();
        myMessageHandler.handleMQTTMessage(new TopicedMessage() {
            @Override
            public String getTopic() {
                return "topicPublishedToServer";
            }

            @Override
            public byte[] getPayload() {
                byte[] b = {2,2,34};
                return b;
            }

            @Override
            public MqttMessage getEncapsulatedMessage() {
                return null;
            }
        });
        //myMqttGateway.subscribeToTopic("topicPublishedToServer");
        //System.out.println(myMqttGateway.getReceivedMessage().getPayload());
        //System.out.println(myMqttGateway.getReceivedMessage().getTopic());
    }

    */
}
