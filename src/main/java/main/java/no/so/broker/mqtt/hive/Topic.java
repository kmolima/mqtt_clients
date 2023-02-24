package main.java.no.so.broker.mqtt.hive;

import com.hivemq.client.mqtt.datatypes.MqttQos;

// Class automatically factored by yaml parser constructor
public class Topic {

    private String publishTopic;
    private String subscribeTopic;
    private String source;
    private int qos;


    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /* Changes qos in yaml config into MqttQos Enum
     * https://hivemq.github.io/hivemq-mqtt-client/docs/mqtt-operations/publish/#quality-of-service-qos
     */
    public MqttQos getConfiguredQos() {
        this.qos =  qos < 0 && qos > 2? 1: qos; //0 - AT_MOST_ONCE  | 1 - AT_MOST_ONCE | 2 - EXACTLY_ONCE
        return MqttQos.fromCode(this.qos);
    }

    public int getQos() {return  this.qos;};

    protected void setQos(int qos) {
        this.qos = qos;
    }

    public String getSubscribeTopic() {
        return subscribeTopic;
    }

    protected void setSubscribeTopic(String subscribe_topic) {
        this.subscribeTopic = subscribe_topic;
    }

    public String getPublishTopic() {
        return publishTopic;
    }

    protected void setPublishTopic(String publish_topic) {
        this.publishTopic = publish_topic;
    }
}
