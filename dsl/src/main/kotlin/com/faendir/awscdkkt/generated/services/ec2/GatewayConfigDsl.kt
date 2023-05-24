package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.GatewayConfig

@Generated
public fun buildGatewayConfig(initializer: @AwsCdkDsl GatewayConfig.Builder.() -> Unit):
    GatewayConfig = GatewayConfig.Builder().apply(initializer).build()
