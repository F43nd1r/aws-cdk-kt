package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions

@Generated
public fun encryptionAtRestOptions(initializer: EncryptionAtRestOptions.Builder.() -> Unit = {}):
    EncryptionAtRestOptions = EncryptionAtRestOptions.builder().apply(initializer).build()
