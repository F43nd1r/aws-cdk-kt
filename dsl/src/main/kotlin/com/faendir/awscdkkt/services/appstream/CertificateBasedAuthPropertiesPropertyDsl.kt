package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig

@Generated
public
    fun certificateBasedAuthPropertiesProperty(initializer: CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.Builder.() -> Unit
    = {}): CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty =
    CfnDirectoryConfig.CertificateBasedAuthPropertiesProperty.builder().apply(initializer).build()
