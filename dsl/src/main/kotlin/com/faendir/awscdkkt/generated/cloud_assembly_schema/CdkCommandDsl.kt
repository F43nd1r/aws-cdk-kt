package com.faendir.awscdkkt.generated.cloud_assembly_schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloud_assembly_schema.CdkCommand

@Generated
public fun buildCdkCommand(initializer: @AwsCdkDsl CdkCommand.Builder.() -> Unit = {}): CdkCommand =
    CdkCommand.Builder().apply(initializer).build()
