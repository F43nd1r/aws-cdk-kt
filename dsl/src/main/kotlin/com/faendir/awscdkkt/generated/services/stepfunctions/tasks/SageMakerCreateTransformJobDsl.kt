package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps
import software.constructs.Construct

@Generated
public fun Construct.sageMakerCreateTransformJob(
  id: String,
  props: SageMakerCreateTransformJobProps,
  initializer: @AwsCdkDsl SageMakerCreateTransformJob.() -> Unit = {},
): SageMakerCreateTransformJob = SageMakerCreateTransformJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSageMakerCreateTransformJob(id: String, initializer: @AwsCdkDsl SageMakerCreateTransformJob.Builder.() -> Unit = {}): SageMakerCreateTransformJob = SageMakerCreateTransformJob.Builder.create(this, id).apply(initializer).build()
