package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public
    fun kafkaClusterEncryptionInTransitProperty(initializer: CfnConnector.KafkaClusterEncryptionInTransitProperty.Builder.() -> Unit
    = {}): CfnConnector.KafkaClusterEncryptionInTransitProperty =
    CfnConnector.KafkaClusterEncryptionInTransitProperty.builder().apply(initializer).build()
