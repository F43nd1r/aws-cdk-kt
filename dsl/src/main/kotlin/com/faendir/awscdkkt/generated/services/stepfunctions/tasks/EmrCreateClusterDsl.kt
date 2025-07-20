package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps
import software.constructs.Construct

@Generated
public fun Construct.emrCreateCluster(
  id: String,
  props: EmrCreateClusterProps,
  initializer: @AwsCdkDsl EmrCreateCluster.() -> Unit = {},
): EmrCreateCluster = EmrCreateCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEmrCreateCluster(id: String, initializer: @AwsCdkDsl EmrCreateCluster.Builder.() -> Unit = {}): EmrCreateCluster = EmrCreateCluster.Builder.create(this, id).apply(initializer).build()
