@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.forecast

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.forecast.CfnDataset

public
    fun encryptionConfigProperty(initializer: CfnDataset.EncryptionConfigProperty.Builder.() -> Unit):
    CfnDataset.EncryptionConfigProperty =
    CfnDataset.EncryptionConfigProperty.builder().apply(initializer).build()
