package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildEmailConfigurationProperty(initializer: @AwsCdkDsl
    CfnUserPool.EmailConfigurationProperty.Builder.() -> Unit = {}):
    CfnUserPool.EmailConfigurationProperty =
    CfnUserPool.EmailConfigurationProperty.Builder().apply(initializer).build()
