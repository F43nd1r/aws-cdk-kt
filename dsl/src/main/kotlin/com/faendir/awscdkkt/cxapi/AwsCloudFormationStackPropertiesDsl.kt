package com.faendir.awscdkkt.cxapi

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.AwsCloudFormationStackProperties

@Generated
public
    fun awsCloudFormationStackProperties(initializer: AwsCloudFormationStackProperties.Builder.() -> Unit
    = {}): AwsCloudFormationStackProperties =
    AwsCloudFormationStackProperties.builder().apply(initializer).build()
