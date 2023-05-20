@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
