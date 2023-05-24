package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.SingleUserHostedRotationOptions

@Generated
public fun buildSingleUserHostedRotationOptions(initializer: @AwsCdkDsl
    SingleUserHostedRotationOptions.Builder.() -> Unit): SingleUserHostedRotationOptions =
    SingleUserHostedRotationOptions.Builder().apply(initializer).build()
