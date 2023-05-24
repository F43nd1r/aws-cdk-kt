package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps
import software.constructs.Construct

@Generated
public fun Construct.emrContainersCreateVirtualCluster(id: String,
    props: EmrContainersCreateVirtualClusterProps): EmrContainersCreateVirtualCluster =
    EmrContainersCreateVirtualCluster(this, id, props)

@Generated
public fun Construct.emrContainersCreateVirtualCluster(
  id: String,
  props: EmrContainersCreateVirtualClusterProps,
  initializer: @AwsCdkDsl EmrContainersCreateVirtualCluster.() -> Unit,
): EmrContainersCreateVirtualCluster = EmrContainersCreateVirtualCluster(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildEmrContainersCreateVirtualCluster(id: String, initializer: @AwsCdkDsl
    EmrContainersCreateVirtualCluster.Builder.() -> Unit): EmrContainersCreateVirtualCluster =
    EmrContainersCreateVirtualCluster.Builder.create(this, id).apply(initializer).build()
