package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun failoverConditionSettingsProperty(initializer: CfnChannel.FailoverConditionSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.FailoverConditionSettingsProperty =
    CfnChannel.FailoverConditionSettingsProperty.builder().apply(initializer).build()
