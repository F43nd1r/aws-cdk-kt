package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.OpenIdConnectConfig

@Generated
public fun buildOpenIdConnectConfig(initializer: @AwsCdkDsl OpenIdConnectConfig.Builder.() -> Unit):
    OpenIdConnectConfig = OpenIdConnectConfig.Builder().apply(initializer).build()
