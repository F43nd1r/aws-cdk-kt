package com.faendir.awscdkkt.generated.services.lightsail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnInstance

@Generated
public fun buildNetworkingProperty(initializer: @AwsCdkDsl
    CfnInstance.NetworkingProperty.Builder.() -> Unit = {}): CfnInstance.NetworkingProperty =
    CfnInstance.NetworkingProperty.Builder().apply(initializer).build()
