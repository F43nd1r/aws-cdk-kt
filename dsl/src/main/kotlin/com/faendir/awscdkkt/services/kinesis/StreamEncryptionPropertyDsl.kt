@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStream

public
    fun streamEncryptionProperty(initializer: CfnStream.StreamEncryptionProperty.Builder.() -> Unit):
    CfnStream.StreamEncryptionProperty =
    CfnStream.StreamEncryptionProperty.builder().apply(initializer).build()
