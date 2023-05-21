package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun autoScalingProperty(initializer: CfnConnector.AutoScalingProperty.Builder.() -> Unit =
    {}): CfnConnector.AutoScalingProperty =
    CfnConnector.AutoScalingProperty.builder().apply(initializer).build()
