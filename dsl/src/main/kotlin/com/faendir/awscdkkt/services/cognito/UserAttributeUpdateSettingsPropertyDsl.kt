package com.faendir.awscdkkt.services.cognito

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public
    fun userAttributeUpdateSettingsProperty(initializer: CfnUserPool.UserAttributeUpdateSettingsProperty.Builder.() -> Unit
    = {}): CfnUserPool.UserAttributeUpdateSettingsProperty =
    CfnUserPool.UserAttributeUpdateSettingsProperty.builder().apply(initializer).build()
