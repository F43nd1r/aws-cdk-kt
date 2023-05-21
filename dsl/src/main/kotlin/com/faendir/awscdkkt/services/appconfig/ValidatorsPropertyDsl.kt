package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnConfigurationProfile

@Generated
public
    fun validatorsProperty(initializer: CfnConfigurationProfile.ValidatorsProperty.Builder.() -> Unit
    = {}): CfnConfigurationProfile.ValidatorsProperty =
    CfnConfigurationProfile.ValidatorsProperty.builder().apply(initializer).build()
