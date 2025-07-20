package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateClusterProps
import software.constructs.Construct

@Generated
public fun Construct.emrTerminateCluster(
  id: String,
  props: EmrTerminateClusterProps,
  initializer: @AwsCdkDsl EmrTerminateCluster.() -> Unit = {},
): EmrTerminateCluster = EmrTerminateCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEmrTerminateCluster(id: String, initializer: @AwsCdkDsl EmrTerminateCluster.Builder.() -> Unit = {}): EmrTerminateCluster = EmrTerminateCluster.Builder.create(this, id).apply(initializer).build()
