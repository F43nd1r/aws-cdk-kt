package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnHttpApi

@Generated
public fun httpApiAuthProperty(initializer: CfnHttpApi.HttpApiAuthProperty.Builder.() -> Unit = {}):
    CfnHttpApi.HttpApiAuthProperty =
    CfnHttpApi.HttpApiAuthProperty.builder().apply(initializer).build()
