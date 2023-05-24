package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Credentials

@Generated
public fun buildCredentials(initializer: @AwsCdkDsl Credentials.Builder.() -> Unit): Credentials =
    Credentials.Builder().apply(initializer).build()
