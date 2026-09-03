package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnCluster

@Generated
public fun buildKubeSchedulerConfigProperty(initializer: @AwsCdkDsl CfnCluster.KubeSchedulerConfigProperty.Builder.() -> Unit = {}): CfnCluster.KubeSchedulerConfigProperty = CfnCluster.KubeSchedulerConfigProperty.Builder().apply(initializer).build()
