package com.faendir.awscdkkt.services.panorama

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnApplicationInstance

@Generated
public
    fun manifestPayloadProperty(initializer: CfnApplicationInstance.ManifestPayloadProperty.Builder.() -> Unit
    = {}): CfnApplicationInstance.ManifestPayloadProperty =
    CfnApplicationInstance.ManifestPayloadProperty.builder().apply(initializer).build()
