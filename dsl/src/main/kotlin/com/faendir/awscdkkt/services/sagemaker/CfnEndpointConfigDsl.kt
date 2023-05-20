@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfigProps
import software.constructs.Construct

public fun Construct.cfnEndpointConfig(
  id: String,
  props: CfnEndpointConfigProps,
  initializer: CfnEndpointConfig.() -> Unit = {},
): CfnEndpointConfig = CfnEndpointConfig(this, id, props).apply(initializer)
