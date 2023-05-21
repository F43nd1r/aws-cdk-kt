package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public
    fun kafkaClusterClientAuthenticationProperty(initializer: CfnConnector.KafkaClusterClientAuthenticationProperty.Builder.() -> Unit
    = {}): CfnConnector.KafkaClusterClientAuthenticationProperty =
    CfnConnector.KafkaClusterClientAuthenticationProperty.builder().apply(initializer).build()
