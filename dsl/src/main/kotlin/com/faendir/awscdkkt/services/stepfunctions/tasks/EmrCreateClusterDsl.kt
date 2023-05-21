package com.faendir.awscdkkt.services.stepfunctions.tasks

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
  initializer: EmrCreateCluster.() -> Unit = {},
): EmrCreateCluster = EmrCreateCluster(this, id, props).apply(initializer)
