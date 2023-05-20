@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTrainingJobProps
import software.constructs.Construct

public fun Construct.sageMakerCreateTrainingJob(
  id: String,
  props: SageMakerCreateTrainingJobProps,
  initializer: SageMakerCreateTrainingJob.() -> Unit = {},
): SageMakerCreateTrainingJob = SageMakerCreateTrainingJob(this, id, props).apply(initializer)
