package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.GatewayConfig

@Generated
public fun gatewayConfig(initializer: GatewayConfig.Builder.() -> Unit = {}): GatewayConfig =
    GatewayConfig.builder().apply(initializer).build()
