@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.dms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.dms.CfnEndpoint
import software.amazon.awscdk.services.dms.CfnEndpointProps
import software.constructs.Construct

public fun Construct.cfnEndpoint(
  id: String,
  props: CfnEndpointProps,
  initializer: CfnEndpoint.() -> Unit = {},
): CfnEndpoint = CfnEndpoint(this, id, props).apply(initializer)
