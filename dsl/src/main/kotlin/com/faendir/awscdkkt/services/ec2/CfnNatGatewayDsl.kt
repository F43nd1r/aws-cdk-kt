package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNatGateway
import software.amazon.awscdk.services.ec2.CfnNatGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNatGateway(
  id: String,
  props: CfnNatGatewayProps,
  initializer: CfnNatGateway.() -> Unit = {},
): CfnNatGateway = CfnNatGateway(this, id, props).apply(initializer)
