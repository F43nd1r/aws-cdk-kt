@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
