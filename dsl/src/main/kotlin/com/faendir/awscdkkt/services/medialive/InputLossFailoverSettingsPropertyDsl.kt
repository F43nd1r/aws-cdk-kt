package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun inputLossFailoverSettingsProperty(initializer: CfnChannel.InputLossFailoverSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.InputLossFailoverSettingsProperty =
    CfnChannel.InputLossFailoverSettingsProperty.builder().apply(initializer).build()
