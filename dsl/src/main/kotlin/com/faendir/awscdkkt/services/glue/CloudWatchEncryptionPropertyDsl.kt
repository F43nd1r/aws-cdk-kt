@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

public
    fun cloudWatchEncryptionProperty(initializer: CfnSecurityConfiguration.CloudWatchEncryptionProperty.Builder.() -> Unit):
    CfnSecurityConfiguration.CloudWatchEncryptionProperty =
    CfnSecurityConfiguration.CloudWatchEncryptionProperty.builder().apply(initializer).build()
