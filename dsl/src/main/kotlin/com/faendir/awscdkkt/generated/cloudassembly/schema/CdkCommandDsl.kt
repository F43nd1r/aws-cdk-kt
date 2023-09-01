package com.faendir.awscdkkt.generated.cloudassembly.schema

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.cloudassembly.schema.CdkCommand

@Generated
public fun buildCdkCommand(initializer: @AwsCdkDsl CdkCommand.Builder.() -> Unit = {}): CdkCommand =
    CdkCommand.Builder().apply(initializer).build()
