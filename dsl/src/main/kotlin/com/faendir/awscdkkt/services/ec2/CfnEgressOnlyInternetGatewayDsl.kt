package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEgressOnlyInternetGateway(
  id: String,
  props: CfnEgressOnlyInternetGatewayProps,
  initializer: CfnEgressOnlyInternetGateway.() -> Unit = {},
): CfnEgressOnlyInternetGateway = CfnEgressOnlyInternetGateway(this, id, props).apply(initializer)
