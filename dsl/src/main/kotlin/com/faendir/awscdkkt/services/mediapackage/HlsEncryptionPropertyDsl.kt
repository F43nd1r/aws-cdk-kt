package com.faendir.awscdkkt.services.mediapackage

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

@Generated
public
    fun hlsEncryptionProperty(initializer: CfnPackagingConfiguration.HlsEncryptionProperty.Builder.() -> Unit
    = {}): CfnPackagingConfiguration.HlsEncryptionProperty =
    CfnPackagingConfiguration.HlsEncryptionProperty.builder().apply(initializer).build()
