package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun s3NotificationFilterProperty(initializer: CfnFunction.S3NotificationFilterProperty.Builder.() -> Unit
    = {}): CfnFunction.S3NotificationFilterProperty =
    CfnFunction.S3NotificationFilterProperty.builder().apply(initializer).build()
