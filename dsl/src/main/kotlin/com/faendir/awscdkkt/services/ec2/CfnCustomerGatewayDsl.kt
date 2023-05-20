@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnCustomerGateway
import software.amazon.awscdk.services.ec2.CfnCustomerGatewayProps
import software.constructs.Construct

public fun Construct.cfnCustomerGateway(
  id: String,
  props: CfnCustomerGatewayProps,
  initializer: CfnCustomerGateway.() -> Unit = {},
): CfnCustomerGateway = CfnCustomerGateway(this, id, props).apply(initializer)
