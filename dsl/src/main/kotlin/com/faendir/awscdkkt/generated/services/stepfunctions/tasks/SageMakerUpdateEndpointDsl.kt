package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl SageMakerUpdateEndpoint.() -> Unit = {},
): SageMakerUpdateEndpoint = SageMakerUpdateEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSageMakerUpdateEndpoint(id: String, initializer: @AwsCdkDsl SageMakerUpdateEndpoint.Builder.() -> Unit = {}): SageMakerUpdateEndpoint = SageMakerUpdateEndpoint.Builder.create(this, id).apply(initializer).build()
