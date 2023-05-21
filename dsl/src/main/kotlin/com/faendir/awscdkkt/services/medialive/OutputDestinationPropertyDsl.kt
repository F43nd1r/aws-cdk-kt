package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun outputDestinationProperty(initializer: CfnChannel.OutputDestinationProperty.Builder.() -> Unit
    = {}): CfnChannel.OutputDestinationProperty =
    CfnChannel.OutputDestinationProperty.builder().apply(initializer).build()
