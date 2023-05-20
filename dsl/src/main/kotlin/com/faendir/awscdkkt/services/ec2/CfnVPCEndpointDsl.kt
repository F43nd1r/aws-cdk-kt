@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVPCEndpoint
import software.amazon.awscdk.services.ec2.CfnVPCEndpointProps
import software.constructs.Construct

public fun Construct.cfnVPCEndpoint(
  id: String,
  props: CfnVPCEndpointProps,
  initializer: CfnVPCEndpoint.() -> Unit = {},
): CfnVPCEndpoint = CfnVPCEndpoint(this, id, props).apply(initializer)
