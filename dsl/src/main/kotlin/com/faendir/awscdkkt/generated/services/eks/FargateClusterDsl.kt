package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateCluster
import software.amazon.awscdk.services.eks.FargateClusterProps
import software.constructs.Construct

@Generated
public fun Construct.fargateCluster(id: String, props: FargateClusterProps): FargateCluster =
    FargateCluster(this, id, props)

@Generated
public fun Construct.fargateCluster(
  id: String,
  props: FargateClusterProps,
  initializer: @AwsCdkDsl FargateCluster.() -> Unit,
): FargateCluster = FargateCluster(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFargateCluster(id: String, initializer: @AwsCdkDsl
    FargateCluster.Builder.() -> Unit): FargateCluster = FargateCluster.Builder.create(this,
    id).apply(initializer).build()
