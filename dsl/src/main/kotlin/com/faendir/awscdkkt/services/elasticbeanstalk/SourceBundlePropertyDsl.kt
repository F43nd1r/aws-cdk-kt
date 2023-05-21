package com.faendir.awscdkkt.services.elasticbeanstalk

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion

@Generated
public
    fun sourceBundleProperty(initializer: CfnApplicationVersion.SourceBundleProperty.Builder.() -> Unit
    = {}): CfnApplicationVersion.SourceBundleProperty =
    CfnApplicationVersion.SourceBundleProperty.builder().apply(initializer).build()
