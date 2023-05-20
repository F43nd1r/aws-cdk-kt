@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersStartJobRunProps
import software.constructs.Construct

public fun Construct.emrContainersStartJobRun(
  id: String,
  props: EmrContainersStartJobRunProps,
  initializer: EmrContainersStartJobRun.() -> Unit = {},
): EmrContainersStartJobRun = EmrContainersStartJobRun(this, id, props).apply(initializer)
