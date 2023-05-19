@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lex

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lex.CfnBotAlias

public
    fun s3BucketLogDestinationProperty(initializer: CfnBotAlias.S3BucketLogDestinationProperty.Builder.() -> Unit):
    CfnBotAlias.S3BucketLogDestinationProperty =
    CfnBotAlias.S3BucketLogDestinationProperty.builder().apply(initializer).build()
