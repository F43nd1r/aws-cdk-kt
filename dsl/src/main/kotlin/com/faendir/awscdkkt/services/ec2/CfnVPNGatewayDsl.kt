package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPNGateway
import software.amazon.awscdk.services.ec2.CfnVPNGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVPNGateway(
  id: String,
  props: CfnVPNGatewayProps,
  initializer: CfnVPNGateway.() -> Unit = {},
): CfnVPNGateway = CfnVPNGateway(this, id, props).apply(initializer)
