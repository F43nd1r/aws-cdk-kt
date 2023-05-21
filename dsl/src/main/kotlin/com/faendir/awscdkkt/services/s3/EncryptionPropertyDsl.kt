package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnStorageLens

@Generated
public fun encryptionProperty(initializer: CfnStorageLens.EncryptionProperty.Builder.() -> Unit =
    {}): CfnStorageLens.EncryptionProperty =
    CfnStorageLens.EncryptionProperty.builder().apply(initializer).build()
