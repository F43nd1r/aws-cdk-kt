package com.faendir.awscdkkt.generated.services.kafkaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun buildKafkaClusterProperty(initializer: @AwsCdkDsl
    CfnConnector.KafkaClusterProperty.Builder.() -> Unit = {}): CfnConnector.KafkaClusterProperty =
    CfnConnector.KafkaClusterProperty.Builder().apply(initializer).build()
