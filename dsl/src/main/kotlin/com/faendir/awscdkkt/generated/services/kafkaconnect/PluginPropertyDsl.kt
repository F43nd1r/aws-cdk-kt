package com.faendir.awscdkkt.generated.services.kafkaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

@Generated
public fun buildPluginProperty(initializer: @AwsCdkDsl
    CfnConnector.PluginProperty.Builder.() -> Unit = {}): CfnConnector.PluginProperty =
    CfnConnector.PluginProperty.Builder().apply(initializer).build()
