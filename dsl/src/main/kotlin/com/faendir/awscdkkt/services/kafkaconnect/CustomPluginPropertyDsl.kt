package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun customPluginProperty(initializer: CfnConnector.CustomPluginProperty.Builder.() -> Unit =
    {}): CfnConnector.CustomPluginProperty =
    CfnConnector.CustomPluginProperty.builder().apply(initializer).build()
