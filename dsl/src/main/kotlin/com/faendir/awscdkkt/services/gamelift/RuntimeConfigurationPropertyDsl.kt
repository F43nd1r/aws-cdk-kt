@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnFleet

public
    fun runtimeConfigurationProperty(initializer: CfnFleet.RuntimeConfigurationProperty.Builder.() -> Unit):
    CfnFleet.RuntimeConfigurationProperty =
    CfnFleet.RuntimeConfigurationProperty.builder().apply(initializer).build()
