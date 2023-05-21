package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

@Generated
public
    fun instanceDefinitionProperty(initializer: CfnGameServerGroup.InstanceDefinitionProperty.Builder.() -> Unit
    = {}): CfnGameServerGroup.InstanceDefinitionProperty =
    CfnGameServerGroup.InstanceDefinitionProperty.builder().apply(initializer).build()
