@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRunProps
import software.constructs.Construct

public fun Construct.glueDataBrewStartJobRun(
  id: String,
  props: GlueDataBrewStartJobRunProps,
  initializer: GlueDataBrewStartJobRun.() -> Unit = {},
): GlueDataBrewStartJobRun = GlueDataBrewStartJobRun(this, id, props).apply(initializer)
