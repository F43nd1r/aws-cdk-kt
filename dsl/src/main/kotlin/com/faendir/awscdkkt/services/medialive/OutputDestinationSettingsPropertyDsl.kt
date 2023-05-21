package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun outputDestinationSettingsProperty(initializer: CfnChannel.OutputDestinationSettingsProperty.Builder.() -> Unit
    = {}): CfnChannel.OutputDestinationSettingsProperty =
    CfnChannel.OutputDestinationSettingsProperty.builder().apply(initializer).build()
