package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun websiteConfigurationProperty(initializer: CfnBucket.WebsiteConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.WebsiteConfigurationProperty =
    CfnBucket.WebsiteConfigurationProperty.builder().apply(initializer).build()
