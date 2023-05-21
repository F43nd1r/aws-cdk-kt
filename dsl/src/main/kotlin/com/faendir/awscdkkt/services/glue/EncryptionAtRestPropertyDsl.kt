package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnDataCatalogEncryptionSettings

@Generated
public
    fun encryptionAtRestProperty(initializer: CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.Builder.() -> Unit
    = {}): CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty =
    CfnDataCatalogEncryptionSettings.EncryptionAtRestProperty.builder().apply(initializer).build()
