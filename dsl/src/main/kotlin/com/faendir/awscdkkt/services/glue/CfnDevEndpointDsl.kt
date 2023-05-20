@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDevEndpoint
import software.amazon.awscdk.services.glue.CfnDevEndpointProps
import software.constructs.Construct

public fun Construct.cfnDevEndpoint(
  id: String,
  props: CfnDevEndpointProps,
  initializer: CfnDevEndpoint.() -> Unit = {},
): CfnDevEndpoint = CfnDevEndpoint(this, id, props).apply(initializer)
