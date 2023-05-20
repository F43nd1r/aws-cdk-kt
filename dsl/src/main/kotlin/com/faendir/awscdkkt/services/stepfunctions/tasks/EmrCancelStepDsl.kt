@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStepProps
import software.constructs.Construct

public fun Construct.emrCancelStep(
  id: String,
  props: EmrCancelStepProps,
  initializer: EmrCancelStep.() -> Unit = {},
): EmrCancelStep = EmrCancelStep(this, id, props).apply(initializer)
