@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunProps
import software.constructs.Construct

public fun Construct.glueStartJobRun(
  id: String,
  props: GlueStartJobRunProps,
  initializer: GlueStartJobRun.() -> Unit = {},
): GlueStartJobRun = GlueStartJobRun(this, id, props).apply(initializer)
