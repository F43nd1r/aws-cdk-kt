package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualClusterProps
import software.constructs.Construct

@Generated
public fun Construct.emrContainersDeleteVirtualCluster(id: String,
    props: EmrContainersDeleteVirtualClusterProps): EmrContainersDeleteVirtualCluster =
    EmrContainersDeleteVirtualCluster(this, id, props)

@Generated
public fun Construct.emrContainersDeleteVirtualCluster(
  id: String,
  props: EmrContainersDeleteVirtualClusterProps,
  initializer: @AwsCdkDsl EmrContainersDeleteVirtualCluster.() -> Unit,
): EmrContainersDeleteVirtualCluster = EmrContainersDeleteVirtualCluster(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildEmrContainersDeleteVirtualCluster(id: String, initializer: @AwsCdkDsl
    EmrContainersDeleteVirtualCluster.Builder.() -> Unit): EmrContainersDeleteVirtualCluster =
    EmrContainersDeleteVirtualCluster.Builder.create(this, id).apply(initializer).build()
