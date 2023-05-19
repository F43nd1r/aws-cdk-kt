@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointProps
import software.constructs.Construct

public fun Construct.sageMakerCreateEndpoint(
  id: String,
  props: SageMakerCreateEndpointProps,
  initializer: SageMakerCreateEndpoint.() -> Unit = {},
): SageMakerCreateEndpoint = SageMakerCreateEndpoint(this, id, props).apply(initializer)
