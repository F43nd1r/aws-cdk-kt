package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CfnDomain

@Generated
public
    fun encryptionAtRestOptionsProperty(initializer: CfnDomain.EncryptionAtRestOptionsProperty.Builder.() -> Unit
    = {}): CfnDomain.EncryptionAtRestOptionsProperty =
    CfnDomain.EncryptionAtRestOptionsProperty.builder().apply(initializer).build()
