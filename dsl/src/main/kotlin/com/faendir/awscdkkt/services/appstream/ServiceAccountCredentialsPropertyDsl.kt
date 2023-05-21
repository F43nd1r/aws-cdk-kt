package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnDirectoryConfig

@Generated
public
    fun serviceAccountCredentialsProperty(initializer: CfnDirectoryConfig.ServiceAccountCredentialsProperty.Builder.() -> Unit
    = {}): CfnDirectoryConfig.ServiceAccountCredentialsProperty =
    CfnDirectoryConfig.ServiceAccountCredentialsProperty.builder().apply(initializer).build()
