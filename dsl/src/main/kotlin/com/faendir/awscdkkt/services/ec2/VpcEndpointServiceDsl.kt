@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.VpcEndpointService
import software.amazon.awscdk.services.ec2.VpcEndpointServiceProps
import software.constructs.Construct

public fun Construct.vpcEndpointService(
  id: String,
  props: VpcEndpointServiceProps,
  initializer: VpcEndpointService.() -> Unit = {},
): VpcEndpointService = VpcEndpointService(this, id, props).apply(initializer)
