package com.faendir.awscdkkt.generated.services.iotwireless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotwireless.CfnWirelessGateway
import software.amazon.awscdk.services.iotwireless.CfnWirelessGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnWirelessGateway(
  id: String,
  props: CfnWirelessGatewayProps,
  initializer: @AwsCdkDsl CfnWirelessGateway.() -> Unit = {},
): CfnWirelessGateway = CfnWirelessGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnWirelessGateway(id: String, initializer: @AwsCdkDsl CfnWirelessGateway.Builder.() -> Unit = {}): CfnWirelessGateway = CfnWirelessGateway.Builder.create(this, id).apply(initializer).build()
