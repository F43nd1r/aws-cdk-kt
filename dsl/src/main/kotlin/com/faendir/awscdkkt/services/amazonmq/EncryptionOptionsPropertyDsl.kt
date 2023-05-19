@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.amazonmq

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker

public
    fun encryptionOptionsProperty(initializer: CfnBroker.EncryptionOptionsProperty.Builder.() -> Unit):
    CfnBroker.EncryptionOptionsProperty =
    CfnBroker.EncryptionOptionsProperty.builder().apply(initializer).build()
