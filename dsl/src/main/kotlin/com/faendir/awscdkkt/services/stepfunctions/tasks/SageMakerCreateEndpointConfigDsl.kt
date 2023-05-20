@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfigProps
import software.constructs.Construct

public fun Construct.sageMakerCreateEndpointConfig(
  id: String,
  props: SageMakerCreateEndpointConfigProps,
  initializer: SageMakerCreateEndpointConfig.() -> Unit = {},
): SageMakerCreateEndpointConfig = SageMakerCreateEndpointConfig(this, id, props).apply(initializer)
