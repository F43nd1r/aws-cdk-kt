package com.faendir.awscdkkt.services.kendra

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kendra.CfnIndex

@Generated
public
    fun documentMetadataConfigurationProperty(initializer: CfnIndex.DocumentMetadataConfigurationProperty.Builder.() -> Unit
    = {}): CfnIndex.DocumentMetadataConfigurationProperty =
    CfnIndex.DocumentMetadataConfigurationProperty.builder().apply(initializer).build()
