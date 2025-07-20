package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpoint
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.sageMakerCreateEndpoint(
  id: String,
  props: SageMakerCreateEndpointProps,
  initializer: @AwsCdkDsl SageMakerCreateEndpoint.() -> Unit = {},
): SageMakerCreateEndpoint = SageMakerCreateEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSageMakerCreateEndpoint(id: String, initializer: @AwsCdkDsl SageMakerCreateEndpoint.Builder.() -> Unit = {}): SageMakerCreateEndpoint = SageMakerCreateEndpoint.Builder.create(this, id).apply(initializer).build()
