package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration

@Generated
public
    fun cloudWatchEncryptionProperty(initializer: CfnSecurityConfiguration.CloudWatchEncryptionProperty.Builder.() -> Unit
    = {}): CfnSecurityConfiguration.CloudWatchEncryptionProperty =
    CfnSecurityConfiguration.CloudWatchEncryptionProperty.builder().apply(initializer).build()
