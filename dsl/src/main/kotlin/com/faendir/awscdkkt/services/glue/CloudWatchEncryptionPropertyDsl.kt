@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

public
    fun cloudWatchEncryptionProperty(initializer: CfnSecurityConfiguration.CloudWatchEncryptionProperty.Builder.() -> Unit):
    CfnSecurityConfiguration.CloudWatchEncryptionProperty =
    CfnSecurityConfiguration.CloudWatchEncryptionProperty.builder().apply(initializer).build()
