package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.AliasOptions

@Generated
public fun buildAliasOptions(initializer: @AwsCdkDsl AliasOptions.Builder.() -> Unit): AliasOptions
    = AliasOptions.Builder().apply(initializer).build()
