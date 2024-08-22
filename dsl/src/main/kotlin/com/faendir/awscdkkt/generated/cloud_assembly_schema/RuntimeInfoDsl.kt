package com.faendir.awscdkkt.generated.cloud_assembly_schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloud_assembly_schema.RuntimeInfo

@Generated
public fun buildRuntimeInfo(initializer: @AwsCdkDsl RuntimeInfo.Builder.() -> Unit = {}):
    RuntimeInfo = RuntimeInfo.Builder().apply(initializer).build()
