package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnTransitGateway
import software.amazon.awscdk.services.ec2.CfnTransitGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTransitGateway(id: String, props: CfnTransitGatewayProps): CfnTransitGateway
    = CfnTransitGateway(this, id, props)

@Generated
public fun Construct.cfnTransitGateway(
  id: String,
  props: CfnTransitGatewayProps,
  initializer: @AwsCdkDsl CfnTransitGateway.() -> Unit,
): CfnTransitGateway = CfnTransitGateway(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnTransitGateway(id: String): CfnTransitGateway = CfnTransitGateway(this, id)

@Generated
public fun Construct.cfnTransitGateway(id: String, initializer: @AwsCdkDsl
    CfnTransitGateway.() -> Unit): CfnTransitGateway = CfnTransitGateway(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnTransitGateway(id: String, initializer: @AwsCdkDsl
    CfnTransitGateway.Builder.() -> Unit): CfnTransitGateway =
    CfnTransitGateway.Builder.create(this, id).apply(initializer).build()
