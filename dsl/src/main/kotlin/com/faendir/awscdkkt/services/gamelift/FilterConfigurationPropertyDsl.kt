package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue

@Generated
public
    fun filterConfigurationProperty(initializer: CfnGameSessionQueue.FilterConfigurationProperty.Builder.() -> Unit
    = {}): CfnGameSessionQueue.FilterConfigurationProperty =
    CfnGameSessionQueue.FilterConfigurationProperty.builder().apply(initializer).build()
