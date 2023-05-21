package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun s3EventProperty(initializer: CfnFunction.S3EventProperty.Builder.() -> Unit = {}):
    CfnFunction.S3EventProperty = CfnFunction.S3EventProperty.builder().apply(initializer).build()
