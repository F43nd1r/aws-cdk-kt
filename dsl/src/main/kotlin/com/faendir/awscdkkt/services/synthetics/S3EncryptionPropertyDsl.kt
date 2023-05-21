package com.faendir.awscdkkt.services.synthetics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.synthetics.CfnCanary

@Generated
public fun s3EncryptionProperty(initializer: CfnCanary.S3EncryptionProperty.Builder.() -> Unit =
    {}): CfnCanary.S3EncryptionProperty =
    CfnCanary.S3EncryptionProperty.builder().apply(initializer).build()
