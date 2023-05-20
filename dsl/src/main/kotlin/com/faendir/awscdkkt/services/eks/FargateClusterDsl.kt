@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.FargateCluster
import software.amazon.awscdk.services.eks.FargateClusterProps
import software.constructs.Construct

public fun Construct.fargateCluster(
  id: String,
  props: FargateClusterProps,
  initializer: FargateCluster.() -> Unit = {},
): FargateCluster = FargateCluster(this, id, props).apply(initializer)
