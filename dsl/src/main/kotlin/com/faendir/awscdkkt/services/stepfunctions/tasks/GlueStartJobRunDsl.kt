package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunProps
import software.constructs.Construct

@Generated
public fun Construct.glueStartJobRun(
  id: String,
  props: GlueStartJobRunProps,
  initializer: GlueStartJobRun.() -> Unit = {},
): GlueStartJobRun = GlueStartJobRun(this, id, props).apply(initializer)
