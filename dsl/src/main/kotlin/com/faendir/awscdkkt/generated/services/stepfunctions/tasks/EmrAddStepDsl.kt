package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EmrAddStep.() -> Unit = {},
): EmrAddStep = EmrAddStep(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEmrAddStep(id: String, initializer: @AwsCdkDsl
    EmrAddStep.Builder.() -> Unit = {}): EmrAddStep = EmrAddStep.Builder.create(this,
    id).apply(initializer).build()
