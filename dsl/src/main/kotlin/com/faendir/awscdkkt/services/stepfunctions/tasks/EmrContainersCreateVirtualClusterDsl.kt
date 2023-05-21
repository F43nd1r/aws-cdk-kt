package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersCreateVirtualClusterProps
import software.constructs.Construct

@Generated
public fun Construct.emrContainersCreateVirtualCluster(
  id: String,
  props: EmrContainersCreateVirtualClusterProps,
  initializer: EmrContainersCreateVirtualCluster.() -> Unit = {},
): EmrContainersCreateVirtualCluster = EmrContainersCreateVirtualCluster(this, id,
    props).apply(initializer)
