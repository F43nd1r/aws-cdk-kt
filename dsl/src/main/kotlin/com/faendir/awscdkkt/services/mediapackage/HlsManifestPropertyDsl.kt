package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun hlsManifestProperty(initializer: CfnPackagingConfiguration.HlsManifestProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.HlsManifestProperty =
    CfnPackagingConfiguration.HlsManifestProperty.builder().apply(initializer).build()
