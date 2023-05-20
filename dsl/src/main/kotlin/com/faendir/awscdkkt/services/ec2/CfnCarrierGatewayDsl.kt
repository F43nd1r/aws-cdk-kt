@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
