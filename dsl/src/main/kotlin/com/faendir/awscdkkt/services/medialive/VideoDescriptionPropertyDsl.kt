package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun videoDescriptionProperty(initializer: CfnChannel.VideoDescriptionProperty.Builder.() -> Unit
    = {}): CfnChannel.VideoDescriptionProperty =
    CfnChannel.VideoDescriptionProperty.builder().apply(initializer).build()
