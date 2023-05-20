@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnStack

public
    fun chefConfigurationProperty(initializer: CfnStack.ChefConfigurationProperty.Builder.() -> Unit):
    CfnStack.ChefConfigurationProperty =
    CfnStack.ChefConfigurationProperty.builder().apply(initializer).build()
