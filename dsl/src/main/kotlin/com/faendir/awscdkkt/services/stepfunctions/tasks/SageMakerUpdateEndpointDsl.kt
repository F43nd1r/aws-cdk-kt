@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpointProps
import software.constructs.Construct

public fun Construct.sageMakerUpdateEndpoint(
  id: String,
  props: SageMakerUpdateEndpointProps,
  initializer: SageMakerUpdateEndpoint.() -> Unit = {},
): SageMakerUpdateEndpoint = SageMakerUpdateEndpoint(this, id, props).apply(initializer)
