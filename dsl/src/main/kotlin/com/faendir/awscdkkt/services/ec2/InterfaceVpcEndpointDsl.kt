@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
import software.constructs.Construct

public fun Construct.interfaceVpcEndpoint(
  id: String,
  props: InterfaceVpcEndpointProps,
  initializer: InterfaceVpcEndpoint.() -> Unit = {},
): InterfaceVpcEndpoint = InterfaceVpcEndpoint(this, id, props).apply(initializer)
