package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualClusterProps
import software.constructs.Construct

@Generated
public fun Construct.emrContainersDeleteVirtualCluster(
  id: String,
  props: EmrContainersDeleteVirtualClusterProps,
  initializer: EmrContainersDeleteVirtualCluster.() -> Unit = {},
): EmrContainersDeleteVirtualCluster = EmrContainersDeleteVirtualCluster(this, id,
    props).apply(initializer)
