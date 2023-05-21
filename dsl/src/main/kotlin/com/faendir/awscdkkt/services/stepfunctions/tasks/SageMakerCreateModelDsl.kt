package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModel
import software.amazon.awscdk.services.stepfunctions.tasks.SageMakerCreateModelProps
import software.constructs.Construct

@Generated
public fun Construct.sageMakerCreateModel(
  id: String,
  props: SageMakerCreateModelProps,
  initializer: SageMakerCreateModel.() -> Unit = {},
): SageMakerCreateModel = SageMakerCreateModel(this, id, props).apply(initializer)
