package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrAddStepProps
import software.constructs.Construct

@Generated
public fun Construct.emrAddStep(
  id: String,
  props: EmrAddStepProps,
  initializer: EmrAddStep.() -> Unit = {},
): EmrAddStep = EmrAddStep(this, id, props).apply(initializer)
