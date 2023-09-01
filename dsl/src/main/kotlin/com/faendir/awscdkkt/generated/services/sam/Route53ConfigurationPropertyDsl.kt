package com.faendir.awscdkkt.generated.services.sam

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public fun buildRoute53ConfigurationProperty(initializer: @AwsCdkDsl
    CfnHttpApi.Route53ConfigurationProperty.Builder.() -> Unit = {}):
    CfnHttpApi.Route53ConfigurationProperty =
    CfnHttpApi.Route53ConfigurationProperty.Builder().apply(initializer).build()
