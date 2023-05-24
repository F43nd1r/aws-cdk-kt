package com.faendir.awscdkkt.generated.services.ecs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.CfnTaskSet

@Generated
public fun buildNetworkConfigurationProperty(initializer: @AwsCdkDsl
    CfnTaskSet.NetworkConfigurationProperty.Builder.() -> Unit):
    CfnTaskSet.NetworkConfigurationProperty =
    CfnTaskSet.NetworkConfigurationProperty.Builder().apply(initializer).build()
