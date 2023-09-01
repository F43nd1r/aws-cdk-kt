package com.faendir.awscdkkt.generated.cxapi

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cxapi.Environment

@Generated
public fun buildEnvironment(initializer: @AwsCdkDsl Environment.Builder.() -> Unit = {}):
    Environment = Environment.Builder().apply(initializer).build()
