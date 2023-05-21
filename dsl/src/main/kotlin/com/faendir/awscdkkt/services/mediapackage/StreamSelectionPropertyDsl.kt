package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun streamSelectionProperty(initializer: CfnPackagingConfiguration.StreamSelectionProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.StreamSelectionProperty =
    CfnPackagingConfiguration.StreamSelectionProperty.builder().apply(initializer).build()
