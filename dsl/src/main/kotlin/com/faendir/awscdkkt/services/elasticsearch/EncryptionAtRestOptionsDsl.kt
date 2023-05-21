@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.EncryptionAtRestOptions is deprecated in CDK.")
@Generated
public fun encryptionAtRestOptions(initializer: EncryptionAtRestOptions.Builder.() -> Unit = {}):
    EncryptionAtRestOptions = EncryptionAtRestOptions.builder().apply(initializer).build()
