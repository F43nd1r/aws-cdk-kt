package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun inputSpecificationProperty(initializer: CfnChannel.InputSpecificationProperty.Builder.() -> Unit
    = {}): CfnChannel.InputSpecificationProperty =
    CfnChannel.InputSpecificationProperty.builder().apply(initializer).build()
