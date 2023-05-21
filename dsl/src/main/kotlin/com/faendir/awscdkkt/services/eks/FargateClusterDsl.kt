package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateCluster
import software.amazon.awscdk.services.eks.FargateClusterProps
import software.constructs.Construct

@Generated
public fun Construct.fargateCluster(
  id: String,
  props: FargateClusterProps,
  initializer: FargateCluster.() -> Unit = {},
): FargateCluster = FargateCluster(this, id, props).apply(initializer)
