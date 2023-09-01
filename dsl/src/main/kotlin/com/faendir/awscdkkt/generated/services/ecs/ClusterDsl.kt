package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.Cluster
import software.amazon.awscdk.services.ecs.ClusterProps
import software.constructs.Construct

@Generated
public fun Construct.cluster(id: String, initializer: @AwsCdkDsl Cluster.() -> Unit = {}): Cluster =
    Cluster(this, id).apply(initializer)

@Generated
public fun Construct.cluster(
  id: String,
  props: ClusterProps,
  initializer: @AwsCdkDsl Cluster.() -> Unit = {},
): Cluster = Cluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCluster(id: String, initializer: @AwsCdkDsl Cluster.Builder.() -> Unit =
    {}): Cluster = Cluster.Builder.create(this, id).apply(initializer).build()
