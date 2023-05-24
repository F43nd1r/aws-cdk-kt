package com.faendir.awscdkkt.generated.services.lambda.nodejs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.nodejs.BundlingOptions

@Generated
public fun buildBundlingOptions(initializer: @AwsCdkDsl BundlingOptions.Builder.() -> Unit):
    BundlingOptions = BundlingOptions.Builder().apply(initializer).build()
