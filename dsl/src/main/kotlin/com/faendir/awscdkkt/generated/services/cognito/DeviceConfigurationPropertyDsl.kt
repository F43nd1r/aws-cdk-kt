package com.faendir.awscdkkt.generated.services.cognito

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cognito.CfnUserPool

@Generated
public fun buildDeviceConfigurationProperty(initializer: @AwsCdkDsl
    CfnUserPool.DeviceConfigurationProperty.Builder.() -> Unit = {}):
    CfnUserPool.DeviceConfigurationProperty =
    CfnUserPool.DeviceConfigurationProperty.Builder().apply(initializer).build()
