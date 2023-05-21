package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun logDeliveryProperty(initializer: CfnConnector.LogDeliveryProperty.Builder.() -> Unit =
    {}): CfnConnector.LogDeliveryProperty =
    CfnConnector.LogDeliveryProperty.builder().apply(initializer).build()
