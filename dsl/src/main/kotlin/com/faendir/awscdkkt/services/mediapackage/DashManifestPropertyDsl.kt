package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun dashManifestProperty(initializer: CfnPackagingConfiguration.DashManifestProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.DashManifestProperty =
    CfnPackagingConfiguration.DashManifestProperty.builder().apply(initializer).build()
