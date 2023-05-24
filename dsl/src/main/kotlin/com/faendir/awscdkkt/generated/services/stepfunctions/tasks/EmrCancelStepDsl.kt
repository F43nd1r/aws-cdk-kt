package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStep
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCancelStepProps
import software.constructs.Construct

@Generated
public fun Construct.emrCancelStep(id: String, props: EmrCancelStepProps): EmrCancelStep =
    EmrCancelStep(this, id, props)

@Generated
public fun Construct.emrCancelStep(
  id: String,
  props: EmrCancelStepProps,
  initializer: @AwsCdkDsl EmrCancelStep.() -> Unit,
): EmrCancelStep = EmrCancelStep(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEmrCancelStep(id: String, initializer: @AwsCdkDsl
    EmrCancelStep.Builder.() -> Unit): EmrCancelStep = EmrCancelStep.Builder.create(this,
    id).apply(initializer).build()
