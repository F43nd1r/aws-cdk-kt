package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun kafkaClusterProperty(initializer: CfnConnector.KafkaClusterProperty.Builder.() -> Unit =
    {}): CfnConnector.KafkaClusterProperty =
    CfnConnector.KafkaClusterProperty.builder().apply(initializer).build()
