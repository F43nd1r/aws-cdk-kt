package com.faendir.awscdkkt.services.forecast

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDataset

@Generated
public
    fun encryptionConfigProperty(initializer: CfnDataset.EncryptionConfigProperty.Builder.() -> Unit
    = {}): CfnDataset.EncryptionConfigProperty =
    CfnDataset.EncryptionConfigProperty.builder().apply(initializer).build()
