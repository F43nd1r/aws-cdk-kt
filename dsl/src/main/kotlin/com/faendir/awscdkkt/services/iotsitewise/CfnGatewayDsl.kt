@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iotsitewise

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotsitewise.CfnGateway
import software.amazon.awscdk.services.iotsitewise.CfnGatewayProps
import software.constructs.Construct

public fun Construct.cfnGateway(
  id: String,
  props: CfnGatewayProps,
  initializer: CfnGateway.() -> Unit = {},
): CfnGateway = CfnGateway(this, id, props).apply(initializer)
