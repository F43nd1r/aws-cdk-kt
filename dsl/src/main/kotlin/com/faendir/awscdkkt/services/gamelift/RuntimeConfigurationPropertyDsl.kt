package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnFleet

@Generated
public
    fun runtimeConfigurationProperty(initializer: CfnFleet.RuntimeConfigurationProperty.Builder.() -> Unit
    = {}): CfnFleet.RuntimeConfigurationProperty =
    CfnFleet.RuntimeConfigurationProperty.builder().apply(initializer).build()
