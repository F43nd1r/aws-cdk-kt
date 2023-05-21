package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerUpdateEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.sageMakerUpdateEndpoint(
  id: String,
  props: SageMakerUpdateEndpointProps,
  initializer: SageMakerUpdateEndpoint.() -> Unit = {},
): SageMakerUpdateEndpoint = SageMakerUpdateEndpoint(this, id, props).apply(initializer)
