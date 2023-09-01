package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps
import software.constructs.Construct

@Generated
public fun Construct.sageMakerCreateTrainingJob(
  id: String,
  props: SageMakerCreateTrainingJobProps,
  initializer: @AwsCdkDsl SageMakerCreateTrainingJob.() -> Unit = {},
): SageMakerCreateTrainingJob = SageMakerCreateTrainingJob(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSageMakerCreateTrainingJob(id: String, initializer: @AwsCdkDsl
    SageMakerCreateTrainingJob.Builder.() -> Unit = {}): SageMakerCreateTrainingJob =
    SageMakerCreateTrainingJob.Builder.create(this, id).apply(initializer).build()
