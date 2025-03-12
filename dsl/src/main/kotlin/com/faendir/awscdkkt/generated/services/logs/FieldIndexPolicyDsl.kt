package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.FieldIndexPolicy

@Generated
public fun buildFieldIndexPolicy(initializer: @AwsCdkDsl FieldIndexPolicy.Builder.() -> Unit = {}):
    FieldIndexPolicy = FieldIndexPolicy.Builder.create().apply(initializer).build()
