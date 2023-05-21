package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun cmafEncryptionProperty(initializer: CfnPackagingConfiguration.CmafEncryptionProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.CmafEncryptionProperty =
    CfnPackagingConfiguration.CmafEncryptionProperty.builder().apply(initializer).build()
