package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun automaticInputFailoverSettingsProperty(initializer: CfnChannel.AutomaticInputFailoverSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.AutomaticInputFailoverSettingsProperty =
    CfnChannel.AutomaticInputFailoverSettingsProperty.builder().apply(initializer).build()
