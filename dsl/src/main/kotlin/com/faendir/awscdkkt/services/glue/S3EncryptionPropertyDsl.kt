@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

public
    fun s3EncryptionProperty(initializer: CfnSecurityConfiguration.S3EncryptionProperty.Builder.() -> Unit):
    CfnSecurityConfiguration.S3EncryptionProperty =
    CfnSecurityConfiguration.S3EncryptionProperty.builder().apply(initializer).build()
