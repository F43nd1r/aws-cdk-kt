package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ApiKeyConfig

@Generated
public fun buildApiKeyConfig(initializer: @AwsCdkDsl ApiKeyConfig.Builder.() -> Unit): ApiKeyConfig
    = ApiKeyConfig.Builder().apply(initializer).build()
