package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.Permission

@Generated
public fun buildPermission(initializer: @AwsCdkDsl Permission.Builder.() -> Unit): Permission =
    Permission.Builder().apply(initializer).build()
