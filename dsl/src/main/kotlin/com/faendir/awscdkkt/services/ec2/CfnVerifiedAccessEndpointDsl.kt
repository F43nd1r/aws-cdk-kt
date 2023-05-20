@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpoint
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessEndpointProps
import software.constructs.Construct

public fun Construct.cfnVerifiedAccessEndpoint(
  id: String,
  props: CfnVerifiedAccessEndpointProps,
  initializer: CfnVerifiedAccessEndpoint.() -> Unit = {},
): CfnVerifiedAccessEndpoint = CfnVerifiedAccessEndpoint(this, id, props).apply(initializer)
