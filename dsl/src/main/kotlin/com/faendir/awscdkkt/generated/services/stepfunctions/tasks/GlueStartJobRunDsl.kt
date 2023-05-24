package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRun
import software.amazon.awscdk.services.stepfunctions.tasks.GlueStartJobRunProps
import software.constructs.Construct

@Generated
public fun Construct.glueStartJobRun(id: String, props: GlueStartJobRunProps): GlueStartJobRun =
    GlueStartJobRun(this, id, props)

@Generated
public fun Construct.glueStartJobRun(
  id: String,
  props: GlueStartJobRunProps,
  initializer: @AwsCdkDsl GlueStartJobRun.() -> Unit,
): GlueStartJobRun = GlueStartJobRun(this, id, props).apply(initializer)

@Generated
public fun Construct.buildGlueStartJobRun(id: String, initializer: @AwsCdkDsl
    GlueStartJobRun.Builder.() -> Unit): GlueStartJobRun = GlueStartJobRun.Builder.create(this,
    id).apply(initializer).build()
