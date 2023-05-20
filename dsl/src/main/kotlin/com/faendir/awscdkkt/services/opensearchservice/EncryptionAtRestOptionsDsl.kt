@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.EncryptionAtRestOptions

public fun encryptionAtRestOptions(initializer: EncryptionAtRestOptions.Builder.() -> Unit):
    EncryptionAtRestOptions = EncryptionAtRestOptions.builder().apply(initializer).build()
