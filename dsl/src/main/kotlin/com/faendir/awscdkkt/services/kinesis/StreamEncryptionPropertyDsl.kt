@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStream

public
    fun streamEncryptionProperty(initializer: CfnStream.StreamEncryptionProperty.Builder.() -> Unit):
    CfnStream.StreamEncryptionProperty =
    CfnStream.StreamEncryptionProperty.builder().apply(initializer).build()
