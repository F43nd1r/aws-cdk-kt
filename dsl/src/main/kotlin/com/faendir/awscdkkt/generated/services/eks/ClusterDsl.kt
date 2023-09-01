package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl Cluster.() -> Unit = {},
): Cluster = Cluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCluster(id: String, initializer: @AwsCdkDsl Cluster.Builder.() -> Unit =
    {}): Cluster = Cluster.Builder.create(this, id).apply(initializer).build()
