package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

@Generated
public
    fun dataCatalogEncryptionSettingsProperty(initializer: CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.Builder.() -> Unit
    = {}): CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty =
    CfnDataCatalogEncryptionSettings.DataCatalogEncryptionSettingsProperty.builder().apply(initializer).build()
