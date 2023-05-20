@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.forecast

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDataset

public
    fun encryptionConfigProperty(initializer: CfnDataset.EncryptionConfigProperty.Builder.() -> Unit):
    CfnDataset.EncryptionConfigProperty =
    CfnDataset.EncryptionConfigProperty.builder().apply(initializer).build()
