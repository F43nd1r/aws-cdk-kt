@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameServerGroup

public
    fun instanceDefinitionProperty(initializer: CfnGameServerGroup.InstanceDefinitionProperty.Builder.() -> Unit):
    CfnGameServerGroup.InstanceDefinitionProperty =
    CfnGameServerGroup.InstanceDefinitionProperty.builder().apply(initializer).build()
