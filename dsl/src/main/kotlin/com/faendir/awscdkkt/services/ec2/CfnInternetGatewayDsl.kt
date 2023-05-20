@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnInternetGateway
import software.amazon.awscdk.services.ec2.CfnInternetGatewayProps
import software.constructs.Construct

public fun Construct.cfnInternetGateway(id: String, initializer: CfnInternetGateway.() -> Unit =
    {}): CfnInternetGateway = CfnInternetGateway(this, id).apply(initializer)

public fun Construct.cfnInternetGateway(
  id: String,
  props: CfnInternetGatewayProps,
  initializer: CfnInternetGateway.() -> Unit = {},
): CfnInternetGateway = CfnInternetGateway(this, id, props).apply(initializer)
