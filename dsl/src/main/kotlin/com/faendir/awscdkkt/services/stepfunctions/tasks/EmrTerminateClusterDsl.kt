@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrTerminateClusterProps
import software.constructs.Construct

public fun Construct.emrTerminateCluster(
  id: String,
  props: EmrTerminateClusterProps,
  initializer: EmrTerminateCluster.() -> Unit = {},
): EmrTerminateCluster = EmrTerminateCluster(this, id, props).apply(initializer)
