package com.faendir.awscdkkt.services.resourcegroups

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.resourcegroups.CfnGroup

@Generated
public
    fun configurationItemProperty(initializer: CfnGroup.ConfigurationItemProperty.Builder.() -> Unit
    = {}): CfnGroup.ConfigurationItemProperty =
    CfnGroup.ConfigurationItemProperty.builder().apply(initializer).build()
