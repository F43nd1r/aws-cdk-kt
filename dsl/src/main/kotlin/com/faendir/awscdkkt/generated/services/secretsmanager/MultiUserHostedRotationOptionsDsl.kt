package com.faendir.awscdkkt.generated.services.secretsmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.secretsmanager.MultiUserHostedRotationOptions

@Generated
public fun buildMultiUserHostedRotationOptions(initializer: @AwsCdkDsl
    MultiUserHostedRotationOptions.Builder.() -> Unit): MultiUserHostedRotationOptions =
    MultiUserHostedRotationOptions.Builder().apply(initializer).build()
