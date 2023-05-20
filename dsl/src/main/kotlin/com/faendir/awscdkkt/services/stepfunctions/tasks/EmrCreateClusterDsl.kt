@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateClusterProps
import software.constructs.Construct

public fun Construct.emrCreateCluster(
  id: String,
  props: EmrCreateClusterProps,
  initializer: EmrCreateCluster.() -> Unit = {},
): EmrCreateCluster = EmrCreateCluster(this, id, props).apply(initializer)
