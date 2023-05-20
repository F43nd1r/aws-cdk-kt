@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJob
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateTransformJobProps
import software.constructs.Construct

public fun Construct.sageMakerCreateTransformJob(
  id: String,
  props: SageMakerCreateTransformJobProps,
  initializer: SageMakerCreateTransformJob.() -> Unit = {},
): SageMakerCreateTransformJob = SageMakerCreateTransformJob(this, id, props).apply(initializer)
