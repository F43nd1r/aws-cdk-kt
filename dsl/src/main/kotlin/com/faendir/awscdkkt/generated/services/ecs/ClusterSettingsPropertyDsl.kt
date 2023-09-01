package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnCluster

@Generated
public fun buildClusterSettingsProperty(initializer: @AwsCdkDsl
    CfnCluster.ClusterSettingsProperty.Builder.() -> Unit = {}): CfnCluster.ClusterSettingsProperty
    = CfnCluster.ClusterSettingsProperty.Builder().apply(initializer).build()
