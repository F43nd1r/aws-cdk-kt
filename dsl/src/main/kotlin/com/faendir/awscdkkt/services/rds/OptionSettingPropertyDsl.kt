package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnOptionGroup

@Generated
public
    fun optionSettingProperty(initializer: CfnOptionGroup.OptionSettingProperty.Builder.() -> Unit =
    {}): CfnOptionGroup.OptionSettingProperty =
    CfnOptionGroup.OptionSettingProperty.builder().apply(initializer).build()
