@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
