@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

public
    fun s3NotificationFilterProperty(initializer: CfnFunction.S3NotificationFilterProperty.Builder.() -> Unit):
    CfnFunction.S3NotificationFilterProperty =
    CfnFunction.S3NotificationFilterProperty.builder().apply(initializer).build()
