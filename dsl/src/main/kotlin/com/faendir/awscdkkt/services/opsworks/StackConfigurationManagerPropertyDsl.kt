package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnStack

@Generated
public
    fun stackConfigurationManagerProperty(initializer: CfnStack.StackConfigurationManagerProperty.Builder.() -> Unit
    = {}): CfnStack.StackConfigurationManagerProperty =
    CfnStack.StackConfigurationManagerProperty.builder().apply(initializer).build()
