package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStream

@Generated
public
    fun streamEncryptionProperty(initializer: CfnStream.StreamEncryptionProperty.Builder.() -> Unit
    = {}): CfnStream.StreamEncryptionProperty =
    CfnStream.StreamEncryptionProperty.builder().apply(initializer).build()
