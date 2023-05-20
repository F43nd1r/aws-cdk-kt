@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCarrierGateway
import software.amazon.awscdk.services.ec2.CfnCarrierGatewayProps
import software.constructs.Construct

public fun Construct.cfnCarrierGateway(
  id: String,
  props: CfnCarrierGatewayProps,
  initializer: CfnCarrierGateway.() -> Unit = {},
): CfnCarrierGateway = CfnCarrierGateway(this, id, props).apply(initializer)
