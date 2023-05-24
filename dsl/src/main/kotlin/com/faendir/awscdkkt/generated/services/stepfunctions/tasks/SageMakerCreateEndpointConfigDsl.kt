package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfig
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateEndpointConfigProps
import software.constructs.Construct

@Generated
public fun Construct.sageMakerCreateEndpointConfig(id: String,
    props: SageMakerCreateEndpointConfigProps): SageMakerCreateEndpointConfig =
    SageMakerCreateEndpointConfig(this, id, props)

@Generated
public fun Construct.sageMakerCreateEndpointConfig(
  id: String,
  props: SageMakerCreateEndpointConfigProps,
  initializer: @AwsCdkDsl SageMakerCreateEndpointConfig.() -> Unit,
): SageMakerCreateEndpointConfig = SageMakerCreateEndpointConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSageMakerCreateEndpointConfig(id: String, initializer: @AwsCdkDsl
    SageMakerCreateEndpointConfig.Builder.() -> Unit): SageMakerCreateEndpointConfig =
    SageMakerCreateEndpointConfig.Builder.create(this, id).apply(initializer).build()
