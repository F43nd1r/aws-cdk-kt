package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnLayerVersion

@Generated
public fun contentProperty(initializer: CfnLayerVersion.ContentProperty.Builder.() -> Unit = {}):
    CfnLayerVersion.ContentProperty =
    CfnLayerVersion.ContentProperty.builder().apply(initializer).build()
