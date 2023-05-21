package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun cmafPackageProperty(initializer: CfnPackagingConfiguration.CmafPackageProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.CmafPackageProperty =
    CfnPackagingConfiguration.CmafPackageProperty.builder().apply(initializer).build()
