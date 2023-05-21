package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@Generated
public
    fun targetTrackingConfigurationProperty(initializer: CfnGameServerGroup.TargetTrackingConfigurationProperty.Builder.() -> Unit
    = {}): CfnGameServerGroup.TargetTrackingConfigurationProperty =
    CfnGameServerGroup.TargetTrackingConfigurationProperty.builder().apply(initializer).build()
