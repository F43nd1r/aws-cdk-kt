package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun dashPackageProperty(initializer: CfnPackagingConfiguration.DashPackageProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.DashPackageProperty =
    CfnPackagingConfiguration.DashPackageProperty.builder().apply(initializer).build()
