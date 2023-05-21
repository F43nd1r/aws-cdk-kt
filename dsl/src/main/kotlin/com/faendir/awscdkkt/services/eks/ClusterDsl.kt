package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.Cluster
import software.amazon.awscdk.services.eks.ClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cluster(
  id: String,
  props: ClusterProps,
  initializer: Cluster.() -> Unit = {},
): Cluster = Cluster(this, id, props).apply(initializer)
