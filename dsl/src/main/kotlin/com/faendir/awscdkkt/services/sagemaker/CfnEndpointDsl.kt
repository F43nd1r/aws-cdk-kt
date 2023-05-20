@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpoint
import software.amazon.awscdk.services.sagemaker.CfnEndpointProps
import software.constructs.Construct

public fun Construct.cfnEndpoint(
  id: String,
  props: CfnEndpointProps,
  initializer: CfnEndpoint.() -> Unit = {},
): CfnEndpoint = CfnEndpoint(this, id, props).apply(initializer)
