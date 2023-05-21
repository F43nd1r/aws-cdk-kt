package com.faendir.awscdkkt.services.panorama

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.panorama.CfnApplicationInstance

@Generated
public
    fun manifestOverridesPayloadProperty(initializer: CfnApplicationInstance.ManifestOverridesPayloadProperty.Builder.() -> Unit
    = {}): CfnApplicationInstance.ManifestOverridesPayloadProperty =
    CfnApplicationInstance.ManifestOverridesPayloadProperty.builder().apply(initializer).build()
