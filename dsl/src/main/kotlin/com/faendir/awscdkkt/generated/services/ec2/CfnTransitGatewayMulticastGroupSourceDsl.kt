package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSource
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastGroupSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayMulticastGroupSource(
  id: String,
  props: CfnTransitGatewayMulticastGroupSourceProps,
  initializer: @AwsCdkDsl CfnTransitGatewayMulticastGroupSource.() -> Unit = {},
): CfnTransitGatewayMulticastGroupSource = CfnTransitGatewayMulticastGroupSource(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayMulticastGroupSource(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayMulticastGroupSource.Builder.() -> Unit = {}):
    CfnTransitGatewayMulticastGroupSource =
    CfnTransitGatewayMulticastGroupSource.Builder.create(this, id).apply(initializer).build()
