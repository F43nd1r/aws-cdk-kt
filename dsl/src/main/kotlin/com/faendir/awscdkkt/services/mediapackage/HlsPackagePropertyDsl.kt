package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun hlsPackageProperty(initializer: CfnPackagingConfiguration.HlsPackageProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.HlsPackageProperty =
    CfnPackagingConfiguration.HlsPackageProperty.builder().apply(initializer).build()
