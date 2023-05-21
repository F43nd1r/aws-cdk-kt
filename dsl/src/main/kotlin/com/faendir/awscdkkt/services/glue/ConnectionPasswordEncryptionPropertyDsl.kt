package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

@Generated
public
    fun connectionPasswordEncryptionProperty(initializer: CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.Builder.() -> Unit
    = {}): CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty =
    CfnDataCatalogEncryptionSettings.ConnectionPasswordEncryptionProperty.builder().apply(initializer).build()
