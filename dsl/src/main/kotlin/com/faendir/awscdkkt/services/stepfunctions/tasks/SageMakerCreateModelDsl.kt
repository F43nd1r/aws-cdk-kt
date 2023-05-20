@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModelProps
import software.constructs.Construct

public fun Construct.sageMakerCreateModel(
  id: String,
  props: SageMakerCreateModelProps,
  initializer: SageMakerCreateModel.() -> Unit = {},
): SageMakerCreateModel = SageMakerCreateModel(this, id, props).apply(initializer)
