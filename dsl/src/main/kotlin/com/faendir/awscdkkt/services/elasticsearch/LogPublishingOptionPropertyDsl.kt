@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.CfnDomain

public
    fun logPublishingOptionProperty(initializer: CfnDomain.LogPublishingOptionProperty.Builder.() -> Unit):
    CfnDomain.LogPublishingOptionProperty =
    CfnDomain.LogPublishingOptionProperty.builder().apply(initializer).build()
