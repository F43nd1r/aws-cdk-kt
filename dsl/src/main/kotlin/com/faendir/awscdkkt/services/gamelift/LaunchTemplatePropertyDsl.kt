package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@Generated
public
    fun launchTemplateProperty(initializer: CfnGameServerGroup.LaunchTemplateProperty.Builder.() -> Unit
    = {}): CfnGameServerGroup.LaunchTemplateProperty =
    CfnGameServerGroup.LaunchTemplateProperty.builder().apply(initializer).build()
