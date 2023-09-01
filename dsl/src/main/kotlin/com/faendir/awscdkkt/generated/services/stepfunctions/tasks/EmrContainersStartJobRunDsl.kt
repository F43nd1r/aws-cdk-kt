package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl EmrContainersStartJobRun.() -> Unit = {},
): EmrContainersStartJobRun = EmrContainersStartJobRun(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEmrContainersStartJobRun(id: String, initializer: @AwsCdkDsl
    EmrContainersStartJobRun.Builder.() -> Unit = {}): EmrContainersStartJobRun =
    EmrContainersStartJobRun.Builder.create(this, id).apply(initializer).build()
