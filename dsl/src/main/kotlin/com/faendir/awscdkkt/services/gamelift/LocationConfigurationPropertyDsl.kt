package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnFleet

@Generated
public
    fun locationConfigurationProperty(initializer: CfnFleet.LocationConfigurationProperty.Builder.() -> Unit
    = {}): CfnFleet.LocationConfigurationProperty =
    CfnFleet.LocationConfigurationProperty.builder().apply(initializer).build()
