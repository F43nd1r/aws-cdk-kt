package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Cluster
import software.amazon.awscdk.services.ecs.ClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cluster(id: String, initializer: Cluster.() -> Unit = {}): Cluster =
    Cluster(this, id).apply(initializer)

@Generated
public fun Construct.cluster(
  id: String,
  props: ClusterProps,
  initializer: Cluster.() -> Unit = {},
): Cluster = Cluster(this, id, props).apply(initializer)
