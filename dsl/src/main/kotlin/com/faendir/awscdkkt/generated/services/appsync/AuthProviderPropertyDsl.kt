package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnApi

@Generated
public fun buildAuthProviderProperty(initializer: @AwsCdkDsl
    CfnApi.AuthProviderProperty.Builder.() -> Unit = {}): CfnApi.AuthProviderProperty =
    CfnApi.AuthProviderProperty.Builder().apply(initializer).build()
