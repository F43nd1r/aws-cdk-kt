package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun dashEncryptionProperty(initializer: CfnPackagingConfiguration.DashEncryptionProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.DashEncryptionProperty =
    CfnPackagingConfiguration.DashEncryptionProperty.builder().apply(initializer).build()
