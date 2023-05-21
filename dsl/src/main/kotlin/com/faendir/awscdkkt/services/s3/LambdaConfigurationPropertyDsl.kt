package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun lambdaConfigurationProperty(initializer: CfnBucket.LambdaConfigurationProperty.Builder.() -> Unit
    = {}): CfnBucket.LambdaConfigurationProperty =
    CfnBucket.LambdaConfigurationProperty.builder().apply(initializer).build()
