package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeering
import software.amazon.awscdk.services.networkmanager.CfnTransitGatewayPeeringProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGatewayPeering(id: String, props: CfnTransitGatewayPeeringProps):
    CfnTransitGatewayPeering = CfnTransitGatewayPeering(this, id, props)

@Generated
public fun Construct.cfnTransitGatewayPeering(
  id: String,
  props: CfnTransitGatewayPeeringProps,
  initializer: @AwsCdkDsl CfnTransitGatewayPeering.() -> Unit,
): CfnTransitGatewayPeering = CfnTransitGatewayPeering(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGatewayPeering(id: String, initializer: @AwsCdkDsl
    CfnTransitGatewayPeering.Builder.() -> Unit): CfnTransitGatewayPeering =
    CfnTransitGatewayPeering.Builder.create(this, id).apply(initializer).build()
