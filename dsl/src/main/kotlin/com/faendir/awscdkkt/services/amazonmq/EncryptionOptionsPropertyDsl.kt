package com.faendir.awscdkkt.services.amazonmq

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker

@Generated
public
    fun encryptionOptionsProperty(initializer: CfnBroker.EncryptionOptionsProperty.Builder.() -> Unit
    = {}): CfnBroker.EncryptionOptionsProperty =
    CfnBroker.EncryptionOptionsProperty.builder().apply(initializer).build()
