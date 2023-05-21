package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public fun outputGroupProperty(initializer: CfnChannel.OutputGroupProperty.Builder.() -> Unit = {}):
    CfnChannel.OutputGroupProperty =
    CfnChannel.OutputGroupProperty.builder().apply(initializer).build()
