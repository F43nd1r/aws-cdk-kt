@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnFleet

public
    fun runtimeConfigurationProperty(initializer: CfnFleet.RuntimeConfigurationProperty.Builder.() -> Unit):
    CfnFleet.RuntimeConfigurationProperty =
    CfnFleet.RuntimeConfigurationProperty.builder().apply(initializer).build()
