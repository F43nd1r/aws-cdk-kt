@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrContainersDeleteVirtualClusterProps
import software.constructs.Construct

public fun Construct.emrContainersDeleteVirtualCluster(
  id: String,
  props: EmrContainersDeleteVirtualClusterProps,
  initializer: EmrContainersDeleteVirtualCluster.() -> Unit = {},
): EmrContainersDeleteVirtualCluster = EmrContainersDeleteVirtualCluster(this, id,
    props).apply(initializer)
