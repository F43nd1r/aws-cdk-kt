@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions

public fun encryptionAtRestOptions(initializer: EncryptionAtRestOptions.Builder.() -> Unit):
    EncryptionAtRestOptions = EncryptionAtRestOptions.builder().apply(initializer).build()
