package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnOptionGroup

@Generated
public
    fun optionConfigurationProperty(initializer: CfnOptionGroup.OptionConfigurationProperty.Builder.() -> Unit
    = {}): CfnOptionGroup.OptionConfigurationProperty =
    CfnOptionGroup.OptionConfigurationProperty.builder().apply(initializer).build()
