package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps
import software.constructs.Construct

@Generated
public fun Construct.emrContainersStartJobRun(
  id: String,
  props: EmrContainersStartJobRunProps,
  initializer: EmrContainersStartJobRun.() -> Unit = {},
): EmrContainersStartJobRun = EmrContainersStartJobRun(this, id, props).apply(initializer)
