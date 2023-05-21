package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnStack

@Generated
public
    fun chefConfigurationProperty(initializer: CfnStack.ChefConfigurationProperty.Builder.() -> Unit
    = {}): CfnStack.ChefConfigurationProperty =
    CfnStack.ChefConfigurationProperty.builder().apply(initializer).build()
