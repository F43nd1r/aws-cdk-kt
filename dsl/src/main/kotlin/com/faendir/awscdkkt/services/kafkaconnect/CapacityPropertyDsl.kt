package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun capacityProperty(initializer: CfnConnector.CapacityProperty.Builder.() -> Unit = {}):
    CfnConnector.CapacityProperty =
    CfnConnector.CapacityProperty.builder().apply(initializer).build()
