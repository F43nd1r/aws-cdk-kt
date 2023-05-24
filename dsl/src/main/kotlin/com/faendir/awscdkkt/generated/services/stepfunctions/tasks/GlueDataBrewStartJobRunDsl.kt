package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueDataBrewStartJobRunProps
import software.constructs.Construct

@Generated
public fun Construct.glueDataBrewStartJobRun(id: String, props: GlueDataBrewStartJobRunProps):
    GlueDataBrewStartJobRun = GlueDataBrewStartJobRun(this, id, props)

@Generated
public fun Construct.glueDataBrewStartJobRun(
  id: String,
  props: GlueDataBrewStartJobRunProps,
  initializer: @AwsCdkDsl GlueDataBrewStartJobRun.() -> Unit,
): GlueDataBrewStartJobRun = GlueDataBrewStartJobRun(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGlueDataBrewStartJobRun(id: String, initializer: @AwsCdkDsl
    GlueDataBrewStartJobRun.Builder.() -> Unit): GlueDataBrewStartJobRun =
    GlueDataBrewStartJobRun.Builder.create(this, id).apply(initializer).build()
