package com.faendir.awscdkkt.services.glue

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnCrawler

@Generated
public fun s3TargetProperty(initializer: CfnCrawler.S3TargetProperty.Builder.() -> Unit = {}):
    CfnCrawler.S3TargetProperty = CfnCrawler.S3TargetProperty.builder().apply(initializer).build()
