@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
